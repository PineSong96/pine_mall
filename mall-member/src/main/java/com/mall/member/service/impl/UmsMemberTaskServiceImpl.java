package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsMemberTaskDao;
import com.mall.core.ums.entity.UmsMemberTask;
import com.mall.member.service.UmsMemberTaskService;

@Service
@Slf4j
public class UmsMemberTaskServiceImpl implements UmsMemberTaskService {

    @Autowired
    private UmsMemberTaskDao umsMemberTaskDao;

    @Override
    public List<UmsMemberTask> getUmsMemberTaskList(UmsMemberTask record) {
        return umsMemberTaskDao.queryAllUmsMemberTask(record);
    }

    @Override
    public List<UmsMemberTask> getUmsMemberTaskByPage( UmsMemberTask record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsMemberTaskDao.queryAllUmsMemberTask(record);
    }

    @Override
    public UmsMemberTask getUmsMemberTaskById(Long id) {
        return umsMemberTaskDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsMemberTask getUmsMemberTask(UmsMemberTask record) {
        return umsMemberTaskDao.queryUmsMemberTask(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsMemberTask(UmsMemberTask record) {
        return umsMemberTaskDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsMemberTaskDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsMemberTask(UmsMemberTask record) {
        return umsMemberTaskDao.updateByPrimaryKeySelective(record);
    }

}
