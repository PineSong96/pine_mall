package com.mall.member.service;

import com.mall.core.ums.entity.UmsRolePermissionRelation;
import java.util.List;

/**
 * 后台用户角色和权限关系表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsRolePermissionRelationService {

    List<UmsRolePermissionRelation> getUmsRolePermissionRelationList(UmsRolePermissionRelation record);

    List<UmsRolePermissionRelation> getUmsRolePermissionRelationByPage(UmsRolePermissionRelation record, Integer pageSize, Integer pageNum);

    UmsRolePermissionRelation getUmsRolePermissionRelationById(Long id);

    UmsRolePermissionRelation getUmsRolePermissionRelation(UmsRolePermissionRelation record);

    int createUmsRolePermissionRelation(UmsRolePermissionRelation record);

    int delete(Long id);

    int updateUmsRolePermissionRelation(UmsRolePermissionRelation record);

}

