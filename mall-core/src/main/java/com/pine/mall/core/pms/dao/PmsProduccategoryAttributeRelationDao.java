package com.pine.mall.core.pms.dao;

import java.util.List;

import com.pine.mall.core.pms.entity.PmsProduccategoryAttributeRelation;

/**
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:41
 */
public interface PmsProduccategoryAttributeRelationDao {

    int delete(Long id);

    int insertSelective(PmsProduccategoryAttributeRelation record);

    PmsProduccategoryAttributeRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProduccategoryAttributeRelation record);

    List<PmsProduccategoryAttributeRelation> queryAllPmsProduccategoryAttributeRelation(PmsProduccategoryAttributeRelation record);


    PmsProduccategoryAttributeRelation queryPmsProduccategoryAttributeRelation(PmsProduccategoryAttributeRelation record);

}
