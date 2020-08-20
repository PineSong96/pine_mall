package com.mall.core.ums.dao;

import java.util.List;
import java.util.Map;

import com.mall.core.ums.entity.UmsRolePermissionRelation;

/**
 * 后台用户角色和权限关系表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsRolePermissionRelationDao {

    int deleteById(Long id);

    int insertSelective(UmsRolePermissionRelation record);

    UmsRolePermissionRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsRolePermissionRelation record);

    List<UmsRolePermissionRelation> queryAllUmsRolePermissionRelation(UmsRolePermissionRelation record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsRolePermissionRelation queryUmsRolePermissionRelation(UmsRolePermissionRelation record);

}
