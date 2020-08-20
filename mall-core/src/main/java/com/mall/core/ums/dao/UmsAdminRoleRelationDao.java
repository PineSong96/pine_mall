package com.mall.core.ums.dao;

import java.util.List;
import java.util.Map;

import com.mall.core.ums.entity.UmsAdminRoleRelation;

/**
 * 后台用户和角色关系表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsAdminRoleRelationDao {

    int deleteById(Long id);

    int insertSelective(UmsAdminRoleRelation record);

    UmsAdminRoleRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminRoleRelation record);

    List<UmsAdminRoleRelation> queryAllUmsAdminRoleRelation(UmsAdminRoleRelation record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsAdminRoleRelation queryUmsAdminRoleRelation(UmsAdminRoleRelation record);

}
