package com.mall.core.ums.dao;

import java.util.List;
import java.util.Map;

import com.mall.core.ums.entity.UmsIntegrationConsumeSetting;

/**
 * 积分消费设置
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsIntegrationConsumeSettingDao {

    int deleteById(Long id);

    int insertSelective(UmsIntegrationConsumeSetting record);

    UmsIntegrationConsumeSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsIntegrationConsumeSetting record);

    List<UmsIntegrationConsumeSetting> queryAllUmsIntegrationConsumeSetting(UmsIntegrationConsumeSetting record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsIntegrationConsumeSetting queryUmsIntegrationConsumeSetting(UmsIntegrationConsumeSetting record);

}
