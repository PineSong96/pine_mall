package com.pine.mall.core.pms.dao;

import java.util.List;

import com.pine.mall.core.pms.entity.PmsProducladder;

/**
 * 产品阶梯价格表(只针对同商品)
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:41
 */
public interface PmsProducladderDao {

    int delete(Long id);

    int insertSelective(PmsProducladder record);

    PmsProducladder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProducladder record);

    List<PmsProducladder> queryAllPmsProducladder(PmsProducladder record);


    PmsProducladder queryPmsProducladder(PmsProducladder record);

}
