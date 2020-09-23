package com.pine.mall.core.pms.dao;

import java.util.List;

import com.pine.mall.core.pms.entity.PmsProduccategory;

/**
 * 产品分类
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:41
 */
public interface PmsProduccategoryDao {

    int delete(Long id);

    int insertSelective(PmsProduccategory record);

    PmsProduccategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProduccategory record);

    List<PmsProduccategory> queryAllPmsProduccategory(PmsProduccategory record);


    PmsProduccategory queryPmsProduccategory(PmsProduccategory record);

}
