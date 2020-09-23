package com.pine.mall.core.ums.dao;

import java.util.List;

import com.pine.mall.core.ums.entity.UmsMemberMemberTagRelation;

/**
 * 用户和标签关系表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberMemberTagRelationDao {

    int deleteById(Long id);

    int insertSelective(UmsMemberMemberTagRelation record);

    UmsMemberMemberTagRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberMemberTagRelation record);

    List<UmsMemberMemberTagRelation> queryAllUmsMemberMemberTagRelation(UmsMemberMemberTagRelation record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsMemberMemberTagRelation queryUmsMemberMemberTagRelation(UmsMemberMemberTagRelation record);

}
