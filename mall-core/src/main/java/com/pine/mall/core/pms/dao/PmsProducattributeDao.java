package com.pine.mall.core.pms.dao;

import java.util.List;

import com.pine.mall.core.pms.entity.PmsProducattribute;

/**
 * 商品属性参数表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:42
 */
public interface PmsProducattributeDao {

    int delete(Long id);

    int insertSelective(PmsProducattribute record);

    PmsProducattribute selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProducattribute record);

    List<PmsProducattribute> queryAllPmsProducattribute(PmsProducattribute record);


    PmsProducattribute queryPmsProducattribute(PmsProducattribute record);

}
