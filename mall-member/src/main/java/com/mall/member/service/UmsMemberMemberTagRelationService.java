package com.mall.member.service;

import com.mall.core.ums.entity.UmsMemberMemberTagRelation;
import java.util.List;

/**
 * 用户和标签关系表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberMemberTagRelationService {

    List<UmsMemberMemberTagRelation> getUmsMemberMemberTagRelationList(UmsMemberMemberTagRelation record);

    List<UmsMemberMemberTagRelation> getUmsMemberMemberTagRelationByPage(UmsMemberMemberTagRelation record, Integer pageSize, Integer pageNum);

    UmsMemberMemberTagRelation getUmsMemberMemberTagRelationById(Long id);

    UmsMemberMemberTagRelation getUmsMemberMemberTagRelation(UmsMemberMemberTagRelation record);

    int createUmsMemberMemberTagRelation(UmsMemberMemberTagRelation record);

    int delete(Long id);

    int updateUmsMemberMemberTagRelation(UmsMemberMemberTagRelation record);

}

