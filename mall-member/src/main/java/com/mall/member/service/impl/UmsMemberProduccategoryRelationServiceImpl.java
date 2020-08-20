package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsMemberProduccategoryRelationDao;
import com.mall.core.ums.entity.UmsMemberProduccategoryRelation;
import com.mall.member.service.UmsMemberProduccategoryRelationService;

@Service
@Slf4j
public class UmsMemberProduccategoryRelationServiceImpl implements UmsMemberProduccategoryRelationService {

    @Autowired
    private UmsMemberProduccategoryRelationDao umsMemberProduccategoryRelationDao;

    @Override
    public List<UmsMemberProduccategoryRelation> getUmsMemberProduccategoryRelationList(UmsMemberProduccategoryRelation record) {
        return umsMemberProduccategoryRelationDao.queryAllUmsMemberProduccategoryRelation(record);
    }

    @Override
    public List<UmsMemberProduccategoryRelation> getUmsMemberProduccategoryRelationByPage( UmsMemberProduccategoryRelation record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsMemberProduccategoryRelationDao.queryAllUmsMemberProduccategoryRelation(record);
    }

    @Override
    public UmsMemberProduccategoryRelation getUmsMemberProduccategoryRelationById(Long id) {
        return umsMemberProduccategoryRelationDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsMemberProduccategoryRelation getUmsMemberProduccategoryRelation(UmsMemberProduccategoryRelation record) {
        return umsMemberProduccategoryRelationDao.queryUmsMemberProduccategoryRelation(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsMemberProduccategoryRelation(UmsMemberProduccategoryRelation record) {
        return umsMemberProduccategoryRelationDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsMemberProduccategoryRelationDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsMemberProduccategoryRelation(UmsMemberProduccategoryRelation record) {
        return umsMemberProduccategoryRelationDao.updateByPrimaryKeySelective(record);
    }

}
