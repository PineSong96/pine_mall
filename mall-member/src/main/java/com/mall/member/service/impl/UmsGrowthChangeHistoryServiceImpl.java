package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsGrowthChangeHistoryDao;
import com.mall.core.ums.entity.UmsGrowthChangeHistory;
import com.mall.member.service.UmsGrowthChangeHistoryService;

@Service
@Slf4j
public class UmsGrowthChangeHistoryServiceImpl implements UmsGrowthChangeHistoryService {

    @Autowired
    private UmsGrowthChangeHistoryDao umsGrowthChangeHistoryDao;

    @Override
    public List<UmsGrowthChangeHistory> getUmsGrowthChangeHistoryList(UmsGrowthChangeHistory record) {
        return umsGrowthChangeHistoryDao.queryAllUmsGrowthChangeHistory(record);
    }

    @Override
    public List<UmsGrowthChangeHistory> getUmsGrowthChangeHistoryByPage( UmsGrowthChangeHistory record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsGrowthChangeHistoryDao.queryAllUmsGrowthChangeHistory(record);
    }

    @Override
    public UmsGrowthChangeHistory getUmsGrowthChangeHistoryById(Long id) {
        return umsGrowthChangeHistoryDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsGrowthChangeHistory getUmsGrowthChangeHistory(UmsGrowthChangeHistory record) {
        return umsGrowthChangeHistoryDao.queryUmsGrowthChangeHistory(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsGrowthChangeHistory(UmsGrowthChangeHistory record) {
        return umsGrowthChangeHistoryDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsGrowthChangeHistoryDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsGrowthChangeHistory(UmsGrowthChangeHistory record) {
        return umsGrowthChangeHistoryDao.updateByPrimaryKeySelective(record);
    }

}
