package com.pine.mall.admin.service;

import com.pine.mall.core.pms.entity.PmsProduct;

import java.util.List;

/**
 * 商品信息
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-09-25 22:27:57
 */
public interface PmsProductService {

    List<PmsProduct> getPmsProductList(PmsProduct record);

    List<PmsProduct> getPmsProductByPage(PmsProduct record,Integer pageSize, Integer pageNum);

    PmsProduct getPmsProductById(Long id);

    PmsProduct getPmsProduct(PmsProduct record);

    int createPmsProduct(PmsProduct record);

    int delete(Long id);

    int updatePmsProduct(PmsProduct record);

}

