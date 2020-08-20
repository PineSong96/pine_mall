package com.mall.member.service;

import com.mall.core.ums.entity.UmsIntegrationConsumeSetting;
import java.util.List;

/**
 * 积分消费设置
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsIntegrationConsumeSettingService {

    List<UmsIntegrationConsumeSetting> getUmsIntegrationConsumeSettingList(UmsIntegrationConsumeSetting record);

    List<UmsIntegrationConsumeSetting> getUmsIntegrationConsumeSettingByPage(UmsIntegrationConsumeSetting record, Integer pageSize, Integer pageNum);

    UmsIntegrationConsumeSetting getUmsIntegrationConsumeSettingById(Long id);

    UmsIntegrationConsumeSetting getUmsIntegrationConsumeSetting(UmsIntegrationConsumeSetting record);

    int createUmsIntegrationConsumeSetting(UmsIntegrationConsumeSetting record);

    int delete(Long id);

    int updateUmsIntegrationConsumeSetting(UmsIntegrationConsumeSetting record);

}

