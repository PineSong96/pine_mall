package com.mall.member.service;

import com.mall.core.ums.entity.UmsGrowthChangeHistory;
import java.util.List;

/**
 * 成长值变化历史记录表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsGrowthChangeHistoryService {

    List<UmsGrowthChangeHistory> getUmsGrowthChangeHistoryList(UmsGrowthChangeHistory record);

    List<UmsGrowthChangeHistory> getUmsGrowthChangeHistoryByPage(UmsGrowthChangeHistory record, Integer pageSize, Integer pageNum);

    UmsGrowthChangeHistory getUmsGrowthChangeHistoryById(Long id);

    UmsGrowthChangeHistory getUmsGrowthChangeHistory(UmsGrowthChangeHistory record);

    int createUmsGrowthChangeHistory(UmsGrowthChangeHistory record);

    int delete(Long id);

    int updateUmsGrowthChangeHistory(UmsGrowthChangeHistory record);

}

