package com.mall.auth.service;

import com.mall.auth.domain.MemberDetails;
import com.mall.core.ums.dao.UmsMemberDao;
import com.mall.core.ums.entity.UmsMember;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;


/**
 * @vlog: My code, I understand
 * @desc: 认证服务器加载用户的类
 * @author: pine
 * @createDate: 2020/8/12
 * @version: 1.0
 */
@Slf4j
@Component
public class MallUserDetailService implements UserDetailsService {

    /**
     * 方法实现说明:用户登陆
     * @author:smlz
     * @param userName 用户名密码
     * @return: UserDetails
     * @exception:
     * @date:2020/1/21 21:30
     */

    @Autowired
    private UmsMemberDao umsMemberDao;

    /**
     * 校验用户信息
     * @param userName
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        if(StringUtils.isEmpty(userName)) {
            log.warn("用户登陆用户名为空:{}",userName);
            throw new UsernameNotFoundException("用户名不能为空");
        }

        UmsMember umsMember = getByUsername(userName);

        if(null == umsMember) {
            log.warn("根据用户名没有查询到对应的用户信息:{}",userName);
            throw new UsernameNotFoundException("用户不存在");
        }

        log.info("根据用户名:{}获取用户登陆信息:{}",userName,umsMember);

        MemberDetails memberDetails = new MemberDetails(umsMember);

        return memberDetails;
    }

    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    public UmsMember getByUsername(String username) {
        UmsMember umsMember = new UmsMember();
        umsMember.setUsername(username);
        return umsMemberDao.queryUmsMember(umsMember);

    }

}
