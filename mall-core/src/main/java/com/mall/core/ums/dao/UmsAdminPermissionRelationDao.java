package com.mall.core.ums.dao;

import java.util.List;
import java.util.Map;

import com.mall.core.ums.entity.UmsAdminPermissionRelation;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsAdminPermissionRelationDao {

    int deleteById(Long id);

    int insertSelective(UmsAdminPermissionRelation record);

    UmsAdminPermissionRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminPermissionRelation record);

    List<UmsAdminPermissionRelation> queryAllUmsAdminPermissionRelation(UmsAdminPermissionRelation record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsAdminPermissionRelation queryUmsAdminPermissionRelation(UmsAdminPermissionRelation record);

}
