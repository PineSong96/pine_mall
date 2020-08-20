package com.mall.member.service;

import com.mall.core.ums.entity.UmsIntegrationChangeHistory;
import java.util.List;

/**
 * 积分变化历史记录表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsIntegrationChangeHistoryService {

    List<UmsIntegrationChangeHistory> getUmsIntegrationChangeHistoryList(UmsIntegrationChangeHistory record);

    List<UmsIntegrationChangeHistory> getUmsIntegrationChangeHistoryByPage(UmsIntegrationChangeHistory record, Integer pageSize, Integer pageNum);

    UmsIntegrationChangeHistory getUmsIntegrationChangeHistoryById(Long id);

    UmsIntegrationChangeHistory getUmsIntegrationChangeHistory(UmsIntegrationChangeHistory record);

    int createUmsIntegrationChangeHistory(UmsIntegrationChangeHistory record);

    int delete(Long id);

    int updateUmsIntegrationChangeHistory(UmsIntegrationChangeHistory record);

}

