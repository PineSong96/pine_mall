package com.pine.mall.core.pms.dao;

import java.util.List;

import com.pine.mall.core.pms.entity.PmsProduct;

/**
 * 商品信息
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:40
 */
public interface PmsProductDao {

    int deleteById(Long id);

    int insertSelective(PmsProduct record);

    PmsProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProduct record);

    List<PmsProduct> queryAllPmsProduct(PmsProduct record);


    PmsProduct queryPmsProduct(PmsProduct record);

}
