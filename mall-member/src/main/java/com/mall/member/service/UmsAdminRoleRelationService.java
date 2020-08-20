package com.mall.member.service;

import com.mall.core.ums.entity.UmsAdminRoleRelation;
import java.util.List;

/**
 * 后台用户和角色关系表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsAdminRoleRelationService {

    List<UmsAdminRoleRelation> getUmsAdminRoleRelationList(UmsAdminRoleRelation record);

    List<UmsAdminRoleRelation> getUmsAdminRoleRelationByPage(UmsAdminRoleRelation record, Integer pageSize, Integer pageNum);

    UmsAdminRoleRelation getUmsAdminRoleRelationById(Long id);

    UmsAdminRoleRelation getUmsAdminRoleRelation(UmsAdminRoleRelation record);

    int createUmsAdminRoleRelation(UmsAdminRoleRelation record);

    int delete(Long id);

    int updateUmsAdminRoleRelation(UmsAdminRoleRelation record);

}

