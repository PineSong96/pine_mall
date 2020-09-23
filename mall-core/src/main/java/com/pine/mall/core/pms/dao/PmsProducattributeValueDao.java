package com.pine.mall.core.pms.dao;

import java.util.List;

import com.pine.mall.core.pms.entity.PmsProducattributeValue;

/**
 * 存储产品参数信息的表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:41
 */
public interface PmsProducattributeValueDao {

    int delete(Long id);

    int insertSelective(PmsProducattributeValue record);

    PmsProducattributeValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProducattributeValue record);

    List<PmsProducattributeValue> queryAllPmsProducattributeValue(PmsProducattributeValue record);


    PmsProducattributeValue queryPmsProducattributeValue(PmsProducattributeValue record);

}
