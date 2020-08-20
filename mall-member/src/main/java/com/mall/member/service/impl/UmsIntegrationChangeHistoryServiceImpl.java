package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsIntegrationChangeHistoryDao;
import com.mall.core.ums.entity.UmsIntegrationChangeHistory;
import com.mall.member.service.UmsIntegrationChangeHistoryService;

@Service
@Slf4j
public class UmsIntegrationChangeHistoryServiceImpl implements UmsIntegrationChangeHistoryService {

    @Autowired
    private UmsIntegrationChangeHistoryDao umsIntegrationChangeHistoryDao;

    @Override
    public List<UmsIntegrationChangeHistory> getUmsIntegrationChangeHistoryList(UmsIntegrationChangeHistory record) {
        return umsIntegrationChangeHistoryDao.queryAllUmsIntegrationChangeHistory(record);
    }

    @Override
    public List<UmsIntegrationChangeHistory> getUmsIntegrationChangeHistoryByPage( UmsIntegrationChangeHistory record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsIntegrationChangeHistoryDao.queryAllUmsIntegrationChangeHistory(record);
    }

    @Override
    public UmsIntegrationChangeHistory getUmsIntegrationChangeHistoryById(Long id) {
        return umsIntegrationChangeHistoryDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsIntegrationChangeHistory getUmsIntegrationChangeHistory(UmsIntegrationChangeHistory record) {
        return umsIntegrationChangeHistoryDao.queryUmsIntegrationChangeHistory(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsIntegrationChangeHistory(UmsIntegrationChangeHistory record) {
        return umsIntegrationChangeHistoryDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsIntegrationChangeHistoryDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsIntegrationChangeHistory(UmsIntegrationChangeHistory record) {
        return umsIntegrationChangeHistoryDao.updateByPrimaryKeySelective(record);
    }

}
