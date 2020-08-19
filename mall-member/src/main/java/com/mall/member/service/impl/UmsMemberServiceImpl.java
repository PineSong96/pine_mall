package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsMemberDao;
import com.mall.core.ums.entity.UmsMember;
import com.mall.member.service.UmsMemberService;

@Service
@Slf4j
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private UmsMemberDao umsMemberDao;

    @Override
    public List<UmsMember> getUmsMemberList(UmsMember record) {
        return umsMemberDao.queryAllUmsMember(record);
    }

    @Override
    public List<UmsMember> getUmsMemberByPage( UmsMember record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsMemberDao.queryAllUmsMember(record);
    }

    @Override
    public UmsMember getUmsMemberById(Long id) {
        return umsMemberDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsMember getUmsMember(UmsMember record) {
        return umsMemberDao.queryUmsMember(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsMember(UmsMember record) {
        return umsMemberDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsMemberDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsMember(UmsMember record) {
        return umsMemberDao.updateByPrimaryKeySelective(record);
    }

}
