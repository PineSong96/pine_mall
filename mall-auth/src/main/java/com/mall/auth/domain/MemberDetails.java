package com.mall.auth.domain;

import com.mall.core.ums.entity.UmsMember;
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

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
