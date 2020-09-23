package com.pine.mall.core.pms.dao;

import java.util.List;

import com.pine.mall.core.pms.entity.PmsProducfullReduction;

/**
 * 产品满减表(只针对同商品)
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:41
 */
public interface PmsProducfullReductionDao {

    int delete(Long id);

    int insertSelective(PmsProducfullReduction record);

    PmsProducfullReduction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProducfullReduction record);

    List<PmsProducfullReduction> queryAllPmsProducfullReduction(PmsProducfullReduction record);


    PmsProducfullReduction queryPmsProducfullReduction(PmsProducfullReduction record);

}
