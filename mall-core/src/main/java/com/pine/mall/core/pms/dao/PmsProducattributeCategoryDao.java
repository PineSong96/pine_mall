package com.pine.mall.core.pms.dao;

import java.util.List;

import com.pine.mall.core.pms.entity.PmsProducattributeCategory;

/**
 * 产品属性分类表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:41
 */
public interface PmsProducattributeCategoryDao {

    int delete(Long id);

    int insertSelective(PmsProducattributeCategory record);

    PmsProducattributeCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProducattributeCategory record);

    List<PmsProducattributeCategory> queryAllPmsProducattributeCategory(PmsProducattributeCategory record);


    PmsProducattributeCategory queryPmsProducattributeCategory(PmsProducattributeCategory record);

}
