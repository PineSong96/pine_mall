package com.mall.member.service.impl;

import com.mall.common.api.CommonResult;
import com.mall.common.api.TokenInfo;
import com.mall.common.exception.BusinessException;
import com.mall.common.util.NickNameUtil;
import com.mall.core.ums.dao.UmsMemberLevelDao;
import com.mall.core.ums.entity.UmsMemberLevel;
import com.mall.member.constant.MDA;
import com.mall.member.service.RedisService;
import com.mall.member.token.TokenRequestUtil;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsMemberDao;
import com.mall.core.ums.entity.UmsMember;
import com.mall.member.service.UmsMemberService;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.spi.service.contexts.SecurityContext;

/**
 * 会员表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-08-19 17:51:03
 */
@Service
@Slf4j
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private UmsMemberDao umsMemberDao;

    @Autowired
    private UmsMemberLevelDao umsMemberLevelDao;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RedisService redisService;


    @Value("${redis.key.prefix.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;

    @Value("${redis.key.expire.authCode}")
    private Long AUTH_CODE_EXPIRE_SECONDS;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
    public List<UmsMember> getUmsMemberList(UmsMember record) {
        return umsMemberDao.queryAllUmsMember(record);
    }

    @Override
    public List<UmsMember> getUmsMemberByPage(UmsMember record, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return umsMemberDao.queryAllUmsMember(record);
    }

    @Override
    public UmsMember getUmsMemberById(Long id) {
        return umsMemberDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsMember getUmsMember(UmsMember record) {
        return umsMemberDao.queryUmsMember(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsMember(UmsMember record) {
        return umsMemberDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsMemberDao.delete(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateUmsMember(UmsMember umsMember) {
        //部分信息不能修改，全部置空
        umsMember.setMemberLevelId(null);
        umsMember.setUsername(null);
        umsMember.setCreateTime(null);
        umsMember.setHistoryIntegration(null);
        umsMember.setIntegration(null);
        umsMember.setStatus(null);
        umsMember.setGrowth(null);
        return umsMemberDao.updateByPrimaryKeySelective(umsMember);
    }

    @Override
    public TokenInfo login(String username, String password) {

        ResponseEntity<TokenInfo> response;

        try {
            //远程调用认证服务器 进行用户登陆
            response = restTemplate.exchange(MDA.OAUTH_LOGIN_URL, HttpMethod.POST, TokenRequestUtil.wrapOauthTokenRequest(username, password), TokenInfo.class);

            TokenInfo tokenInfo = response.getBody();

            log.info("根据用户名:{}登陆成功:TokenInfo:{}", username, tokenInfo);

            return tokenInfo;

        } catch (Exception e) {
            log.error("根据用户名:{}登陆异常:{}", username, e.getMessage());

            return null;
        }
    }

    @Override
    public String refreshToken(String token) {

        log.info("RefreshToken的值为:{}", token);

        if (StringUtils.isEmpty(token)) {
            log.warn("刷新令牌不能为空:{}", token);
            return null;
        }

        ResponseEntity<TokenInfo> responseEntity = null;

        String jwtTokenValue = null;

        try {
            jwtTokenValue = token.substring(tokenHead.length());
            //刷新令牌
            responseEntity = restTemplate.exchange(MDA.OAUTH_LOGIN_URL, HttpMethod.POST, TokenRequestUtil.wrapRefreshTokenRequest(jwtTokenValue), TokenInfo.class);

            TokenInfo tokenInfo = responseEntity.getBody();

            String newAccessToken = tokenInfo.getAccess_token();

            log.info("通过RefreshToken:{}刷新令牌成功accessToken:{}", jwtTokenValue, newAccessToken);

            return newAccessToken;

        } catch (Exception e) {
            log.error("通过RefreshToken:{}刷新令牌失败:{}", jwtTokenValue, e.getMessage());
            return jwtTokenValue;
        }
    }

    @Override
    public CommonResult register(String username, String password, String telephone, String authCode) {


        //验证验证码
        if (!verifyAuthCode(authCode, telephone)) {
            return CommonResult.failed("验证码错误");
        }
        //查询是否已有该用户
        UmsMember exist = new UmsMember();
        exist.setUsername(username);
        List<UmsMember> umsMembers = umsMemberDao.queryAllUmsMember(exist);
        if (!CollectionUtils.isEmpty(umsMembers)) {
            return CommonResult.failed("该用户已经存在");
        }
        //没有该用户进行添加操作
        UmsMember umsMember = new UmsMember();
        umsMember.setUsername(username);
        umsMember.setNickname(NickNameUtil.generateName());
        umsMember.setPhone(telephone);
        umsMember.setPassword(passwordEncoder.encode(password));
        umsMember.setCreateTime(new Date());
        umsMember.setStatus(1);
        //获取默认会员等级并设置
        UmsMemberLevel level = new UmsMemberLevel();
        level.setDefaultStatus(1);
        List<UmsMemberLevel> memberLevelList = umsMemberLevelDao.queryAllUmsMemberLevel(level);
        if (!CollectionUtils.isEmpty(memberLevelList)) {
            umsMember.setMemberLevelId(memberLevelList.get(0).getId());
        }
        umsMemberDao.insertSelective(umsMember);
        umsMember.setPassword(null);
        return CommonResult.success(umsMember, "注册成功");
    }

    @Override
    public CommonResult updatePassword(String telephone, String password, String authCode) {

        //查询是否已有该用户
        UmsMember exist = new UmsMember();
        exist.setPhone(telephone);
        List<UmsMember> umsMembers = umsMemberDao.queryAllUmsMember(exist);
        if (!CollectionUtils.isEmpty(umsMembers)) {
            return CommonResult.failed("该账号不存在");
        }

        //验证验证码
        if (!verifyAuthCode(authCode, telephone)) {
            return CommonResult.failed("验证码错误");
        }
        UmsMember umsMember = umsMembers.get(0);
        umsMember.setPassword(passwordEncoder.encode(password));
        umsMemberDao.updateByPrimaryKeySelective(umsMember);
        return CommonResult.success(null, "密码修改成功");
    }

    @Override
    public UmsMember getCurrentMember() {
        return null;
    }

    //对输入的验证码进行校验
    private boolean verifyAuthCode(String authCode, String telephone) {
        if (StringUtils.isEmpty(authCode)) {
            return false;
        }
        Object realAuthCode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + telephone);
        if (ObjectUtils.isEmpty(realAuthCode)) {
            return false;
        }
        return authCode.equals(realAuthCode);
    }




    @Override
    public CommonResult generateAuthCode(String telPhone) throws BusinessException {

        //1、查询当前用户有么有注册
        UmsMember exist = new UmsMember();
        exist.setPhone(telPhone);
        List<UmsMember> umsMembers = umsMemberDao.queryAllUmsMember(exist);
        if (!CollectionUtils.isEmpty(umsMembers)) {
            throw new BusinessException("用户已经注册!不能重复注册");
        }
        //2、校验60s后有没有再次发送
        if (redisService.hasKey(REDIS_KEY_PREFIX_AUTH_CODE + telPhone)) {
            throw new BusinessException("请60s后再试!");
        }
        //3、生产随机校验码
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        //验证码绑定手机号并存储到redis
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + telPhone, sb.toString(), AUTH_CODE_EXPIRE_SECONDS);
        //TODO 发送短信验证码
        return CommonResult.success(sb.toString(), "获取验证码成功");
    }

}
