package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsMemberMemberTagRelationDao;
import com.mall.core.ums.entity.UmsMemberMemberTagRelation;
import com.mall.member.service.UmsMemberMemberTagRelationService;

@Service
@Slf4j
public class UmsMemberMemberTagRelationServiceImpl implements UmsMemberMemberTagRelationService {

    @Autowired
    private UmsMemberMemberTagRelationDao umsMemberMemberTagRelationDao;

    @Override
    public List<UmsMemberMemberTagRelation> getUmsMemberMemberTagRelationList(UmsMemberMemberTagRelation record) {
        return umsMemberMemberTagRelationDao.queryAllUmsMemberMemberTagRelation(record);
    }

    @Override
    public List<UmsMemberMemberTagRelation> getUmsMemberMemberTagRelationByPage( UmsMemberMemberTagRelation record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsMemberMemberTagRelationDao.queryAllUmsMemberMemberTagRelation(record);
    }

    @Override
    public UmsMemberMemberTagRelation getUmsMemberMemberTagRelationById(Long id) {
        return umsMemberMemberTagRelationDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsMemberMemberTagRelation getUmsMemberMemberTagRelation(UmsMemberMemberTagRelation record) {
        return umsMemberMemberTagRelationDao.queryUmsMemberMemberTagRelation(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsMemberMemberTagRelation(UmsMemberMemberTagRelation record) {
        return umsMemberMemberTagRelationDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsMemberMemberTagRelationDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsMemberMemberTagRelation(UmsMemberMemberTagRelation record) {
        return umsMemberMemberTagRelationDao.updateByPrimaryKeySelective(record);
    }

}
