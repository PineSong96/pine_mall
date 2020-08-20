package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsMemberLevelDao;
import com.mall.core.ums.entity.UmsMemberLevel;
import com.mall.member.service.UmsMemberLevelService;

@Service
@Slf4j
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {

    @Autowired
    private UmsMemberLevelDao umsMemberLevelDao;

    @Override
    public List<UmsMemberLevel> getUmsMemberLevelList(UmsMemberLevel record) {
        return umsMemberLevelDao.queryAllUmsMemberLevel(record);
    }

    @Override
    public List<UmsMemberLevel> getUmsMemberLevelByPage( UmsMemberLevel record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsMemberLevelDao.queryAllUmsMemberLevel(record);
    }

    @Override
    public UmsMemberLevel getUmsMemberLevelById(Long id) {
        return umsMemberLevelDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsMemberLevel getUmsMemberLevel(UmsMemberLevel record) {
        return umsMemberLevelDao.queryUmsMemberLevel(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsMemberLevel(UmsMemberLevel record) {
        return umsMemberLevelDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsMemberLevelDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsMemberLevel(UmsMemberLevel record) {
        return umsMemberLevelDao.updateByPrimaryKeySelective(record);
    }

}
