package com.mall.member.service.impl;

import com.mall.common.api.TokenInfo;
import com.mall.member.constant.MDA;
import com.mall.member.token.TokenRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsMemberDao;
import com.mall.core.ums.entity.UmsMember;
import com.mall.member.service.UmsMemberService;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;


@Service
@Slf4j
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private UmsMemberDao umsMemberDao;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
    public List<UmsMember> getUmsMemberList(UmsMember record) {
        return umsMemberDao.queryAllUmsMember(record);
    }

    @Override
    public List<UmsMember> getUmsMemberByPage( UmsMember record, Integer pageSize, Integer pageNum) {
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
    public int updateUmsMember(UmsMember record) {
        return umsMemberDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public TokenInfo login(String username, String password) {

        ResponseEntity<TokenInfo> response;

        try{
            //远程调用认证服务器 进行用户登陆
            response = restTemplate.exchange(MDA.OAUTH_LOGIN_URL, HttpMethod.POST,TokenRequestUtil.wrapOauthTokenRequest(username,password), TokenInfo.class);

            TokenInfo tokenInfo = response.getBody();

            log.info("根据用户名:{}登陆成功:TokenInfo:{}",username,tokenInfo);

            return tokenInfo;

        }catch (Exception e) {
            log.error("根据用户名:{}登陆异常:{}",username,e.getMessage());

            return null;
        }
    }

    @Override
    public String refreshToken(String token) {

        log.info("RefreshToken的值为:{}",token);

        if(StringUtils.isEmpty(token)) {
            log.warn("刷新令牌不能为空:{}",token);
            return null;
        }

        ResponseEntity<TokenInfo> responseEntity = null ;

        String jwtTokenValue=null ;

        try{
            jwtTokenValue = token.substring(tokenHead.length());
            //刷新令牌
            responseEntity = restTemplate.exchange(MDA.OAUTH_LOGIN_URL, HttpMethod.POST, TokenRequestUtil.wrapRefreshTokenRequest(jwtTokenValue), TokenInfo.class);

            TokenInfo tokenInfo = responseEntity.getBody();

            String newAccessToken = tokenInfo.getAccess_token();

            log.info("通过RefreshToken:{}刷新令牌成功accessToken:{}",jwtTokenValue,newAccessToken);

            return newAccessToken;

        }catch (Exception e) {
            log.error("通过RefreshToken:{}刷新令牌失败:{}",jwtTokenValue,e.getMessage());
            return jwtTokenValue;
        }
    }

}
