package com.pine.mall.admin.service;

import com.pine.mall.admin.dto.PmsBrandParam;
import com.pine.mall.core.pms.entity.PmsBrand;

import java.util.List;

/**
 * 品牌表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-09-25 22:27:58
 */
public interface PmsBrandService {

    List<PmsBrand> getPmsBrandList(PmsBrand record);

    List<PmsBrand> getPmsBrandByPage(PmsBrandParam record, Integer pageSize, Integer pageNum);

    PmsBrand getPmsBrandById(Long id);

    PmsBrand getPmsBrand(PmsBrand record);

    int createPmsBrand(PmsBrand record);

    int delete(Long id);

    int updatePmsBrand(PmsBrand record);

}

