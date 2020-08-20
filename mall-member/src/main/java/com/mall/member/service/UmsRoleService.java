package com.mall.member.service;

import com.mall.core.ums.entity.UmsRole;
import java.util.List;

/**
 * 后台用户角色表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsRoleService {

    List<UmsRole> getUmsRoleList(UmsRole record);

    List<UmsRole> getUmsRoleByPage(UmsRole record, Integer pageSize, Integer pageNum);

    UmsRole getUmsRoleById(Long id);

    UmsRole getUmsRole(UmsRole record);

    int createUmsRole(UmsRole record);

    int delete(Long id);

    int updateUmsRole(UmsRole record);

}

