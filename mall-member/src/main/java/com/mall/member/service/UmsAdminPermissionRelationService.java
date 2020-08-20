package com.mall.member.service;

import com.mall.core.ums.entity.UmsAdminPermissionRelation;
import java.util.List;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsAdminPermissionRelationService {

    List<UmsAdminPermissionRelation> getUmsAdminPermissionRelationList(UmsAdminPermissionRelation record);

    List<UmsAdminPermissionRelation> getUmsAdminPermissionRelationByPage(UmsAdminPermissionRelation record, Integer pageSize, Integer pageNum);

    UmsAdminPermissionRelation getUmsAdminPermissionRelationById(Long id);

    UmsAdminPermissionRelation getUmsAdminPermissionRelation(UmsAdminPermissionRelation record);

    int createUmsAdminPermissionRelation(UmsAdminPermissionRelation record);

    int delete(Long id);

    int updateUmsAdminPermissionRelation(UmsAdminPermissionRelation record);

}

