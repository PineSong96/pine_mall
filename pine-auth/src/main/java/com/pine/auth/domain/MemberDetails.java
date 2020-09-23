package com.pine.auth.domain;

import com.pine.mall.core.ums.entity.UmsMember;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @vlog: My code, I understand
 * @desc:
 * @author: pine
 * @createDate: 2020/8/12
 * @version: 1.0
 */
public class MemberDetails implements UserDetails {

    private UmsMember umsMember;

    public MemberDetails(UmsMember umsMember) {
        this.umsMember = umsMember;
    }

    public UmsMember getUmsMember() {
        return umsMember;
    }

    /**
     * 返回授予用户的权限
     *
     * @return
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        return null;
    }

    @Override
    public String getPassword() {
        return umsMember.getPassword();
    }

    @Override
    public String getUsername() {
        return umsMember.getUsername();
    }

    /**
     * 验证账户是否过期
     *
     * @return
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * 验证账户是否锁定
     *
     * @return
     */
    @Override
    public boolean isAccountNonLocked() {

        return umsMember.getStatus() == 1 ? true : false;
    }

    /**
     * 验证账户密码是否过期
     *
     * @return
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * 验证账户是否禁用
     *
     * @return
     */
    @Override
    public boolean isEnabled() {
        return true;
    }
}
