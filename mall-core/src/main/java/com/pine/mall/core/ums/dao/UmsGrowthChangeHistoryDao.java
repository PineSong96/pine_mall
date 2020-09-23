package com.pine.mall.core.ums.dao;

import java.util.List;

import com.pine.mall.core.ums.entity.UmsGrowthChangeHistory;

/**
 * 成长值变化历史记录表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsGrowthChangeHistoryDao {

    int deleteById(Long id);

    int insertSelective(UmsGrowthChangeHistory record);

    UmsGrowthChangeHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsGrowthChangeHistory record);

    List<UmsGrowthChangeHistory> queryAllUmsGrowthChangeHistory(UmsGrowthChangeHistory record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsGrowthChangeHistory queryUmsGrowthChangeHistory(UmsGrowthChangeHistory record);

}
