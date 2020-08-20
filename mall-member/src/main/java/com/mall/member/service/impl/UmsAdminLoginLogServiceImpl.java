package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsAdminLoginLogDao;
import com.mall.core.ums.entity.UmsAdminLoginLog;
import com.mall.member.service.UmsAdminLoginLogService;

@Service
@Slf4j
public class UmsAdminLoginLogServiceImpl implements UmsAdminLoginLogService {

    @Autowired
    private UmsAdminLoginLogDao umsAdminLoginLogDao;

    @Override
    public List<UmsAdminLoginLog> getUmsAdminLoginLogList(UmsAdminLoginLog record) {
        return umsAdminLoginLogDao.queryAllUmsAdminLoginLog(record);
    }

    @Override
    public List<UmsAdminLoginLog> getUmsAdminLoginLogByPage( UmsAdminLoginLog record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsAdminLoginLogDao.queryAllUmsAdminLoginLog(record);
    }

    @Override
    public UmsAdminLoginLog getUmsAdminLoginLogById(Long id) {
        return umsAdminLoginLogDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsAdminLoginLog getUmsAdminLoginLog(UmsAdminLoginLog record) {
        return umsAdminLoginLogDao.queryUmsAdminLoginLog(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsAdminLoginLog(UmsAdminLoginLog record) {
        return umsAdminLoginLogDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsAdminLoginLogDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsAdminLoginLog(UmsAdminLoginLog record) {
        return umsAdminLoginLogDao.updateByPrimaryKeySelective(record);
    }

}
