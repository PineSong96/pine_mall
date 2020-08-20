package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsIntegrationConsumeSettingDao;
import com.mall.core.ums.entity.UmsIntegrationConsumeSetting;
import com.mall.member.service.UmsIntegrationConsumeSettingService;

@Service
@Slf4j
public class UmsIntegrationConsumeSettingServiceImpl implements UmsIntegrationConsumeSettingService {

    @Autowired
    private UmsIntegrationConsumeSettingDao umsIntegrationConsumeSettingDao;

    @Override
    public List<UmsIntegrationConsumeSetting> getUmsIntegrationConsumeSettingList(UmsIntegrationConsumeSetting record) {
        return umsIntegrationConsumeSettingDao.queryAllUmsIntegrationConsumeSetting(record);
    }

    @Override
    public List<UmsIntegrationConsumeSetting> getUmsIntegrationConsumeSettingByPage( UmsIntegrationConsumeSetting record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsIntegrationConsumeSettingDao.queryAllUmsIntegrationConsumeSetting(record);
    }

    @Override
    public UmsIntegrationConsumeSetting getUmsIntegrationConsumeSettingById(Long id) {
        return umsIntegrationConsumeSettingDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsIntegrationConsumeSetting getUmsIntegrationConsumeSetting(UmsIntegrationConsumeSetting record) {
        return umsIntegrationConsumeSettingDao.queryUmsIntegrationConsumeSetting(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsIntegrationConsumeSetting(UmsIntegrationConsumeSetting record) {
        return umsIntegrationConsumeSettingDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsIntegrationConsumeSettingDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsIntegrationConsumeSetting(UmsIntegrationConsumeSetting record) {
        return umsIntegrationConsumeSettingDao.updateByPrimaryKeySelective(record);
    }

}
