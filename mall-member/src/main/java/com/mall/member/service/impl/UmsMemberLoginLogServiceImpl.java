package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsMemberLoginLogDao;
import com.mall.core.ums.entity.UmsMemberLoginLog;
import com.mall.member.service.UmsMemberLoginLogService;

@Service
@Slf4j
public class UmsMemberLoginLogServiceImpl implements UmsMemberLoginLogService {

    @Autowired
    private UmsMemberLoginLogDao umsMemberLoginLogDao;

    @Override
    public List<UmsMemberLoginLog> getUmsMemberLoginLogList(UmsMemberLoginLog record) {
        return umsMemberLoginLogDao.queryAllUmsMemberLoginLog(record);
    }

    @Override
    public List<UmsMemberLoginLog> getUmsMemberLoginLogByPage( UmsMemberLoginLog record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsMemberLoginLogDao.queryAllUmsMemberLoginLog(record);
    }

    @Override
    public UmsMemberLoginLog getUmsMemberLoginLogById(Long id) {
        return umsMemberLoginLogDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsMemberLoginLog getUmsMemberLoginLog(UmsMemberLoginLog record) {
        return umsMemberLoginLogDao.queryUmsMemberLoginLog(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsMemberLoginLog(UmsMemberLoginLog record) {
        return umsMemberLoginLogDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsMemberLoginLogDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsMemberLoginLog(UmsMemberLoginLog record) {
        return umsMemberLoginLogDao.updateByPrimaryKeySelective(record);
    }

}
