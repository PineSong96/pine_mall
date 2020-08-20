package com.mall.core.ums.dao;

import java.util.List;
import java.util.Map;

import com.mall.core.ums.entity.UmsIntegrationChangeHistory;

/**
 * 积分变化历史记录表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsIntegrationChangeHistoryDao {

    int deleteById(Long id);

    int insertSelective(UmsIntegrationChangeHistory record);

    UmsIntegrationChangeHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsIntegrationChangeHistory record);

    List<UmsIntegrationChangeHistory> queryAllUmsIntegrationChangeHistory(UmsIntegrationChangeHistory record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsIntegrationChangeHistory queryUmsIntegrationChangeHistory(UmsIntegrationChangeHistory record);

}
