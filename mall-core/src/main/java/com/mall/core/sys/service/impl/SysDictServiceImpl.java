package com.mall.core.sys.service.impl;

import com.mall.core.sys.dao.SysDictDao;
import com.mall.core.sys.entity.SysDict;
import com.mall.core.sys.service.SysDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;


@Service
@Slf4j
public class SysDictServiceImpl implements SysDictService {

    @Autowired
    private SysDictDao sysDictDao;

    @Override
    public List<SysDict> getSysDictList(SysDict record) {
        return sysDictDao.queryAllSysDict(record);
    }

    @Override
    public List<SysDict> getSysDictByPage(SysDict record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return sysDictDao.queryAllSysDict(record);
    }

    @Override
    public SysDict getSysDictById(Long id) {
        return sysDictDao.selectByPrimaryKey(id);
    }

    @Override
    public SysDict getSysDict(SysDict record) {
        return sysDictDao.querySysDict(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createSysDict(SysDict record) {
        return sysDictDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return sysDictDao.delete(id);
    }

    @Override
    @Transactional
    public int updateSysDict(SysDict record) {
        return sysDictDao.updateByPrimaryKeySelective(record);
    }

}
