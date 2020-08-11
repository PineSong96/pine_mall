package com.mall.core.pms.dao;

import java.util.List;

import com.mall.core.pms.entity.PmsBrand;

/**
 * 品牌表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-08-11 11:06:15
 */
public interface PmsBrandDao {

    int deleteById(Long id);

    int insertSelective(PmsBrand record);

    PmsBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsBrand record);

    List<PmsBrand> queryAllPmsBrand(PmsBrand record);

    int deleteByIdList(String[] record);

    PmsBrand queryPmsBrand(PmsBrand record);

}
