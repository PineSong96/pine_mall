package com.mall.member.service;

import com.mall.core.ums.entity.UmsPermission;
import java.util.List;

/**
 * 后台用户权限表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsPermissionService {

    List<UmsPermission> getUmsPermissionList(UmsPermission record);

    List<UmsPermission> getUmsPermissionByPage(UmsPermission record, Integer pageSize, Integer pageNum);

    UmsPermission getUmsPermissionById(Long id);

    UmsPermission getUmsPermission(UmsPermission record);

    int createUmsPermission(UmsPermission record);

    int delete(Long id);

    int updateUmsPermission(UmsPermission record);

}

