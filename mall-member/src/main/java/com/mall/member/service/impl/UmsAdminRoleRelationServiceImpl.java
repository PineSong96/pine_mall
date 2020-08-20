package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsAdminRoleRelationDao;
import com.mall.core.ums.entity.UmsAdminRoleRelation;
import com.mall.member.service.UmsAdminRoleRelationService;

@Service
@Slf4j
public class UmsAdminRoleRelationServiceImpl implements UmsAdminRoleRelationService {

    @Autowired
    private UmsAdminRoleRelationDao umsAdminRoleRelationDao;

    @Override
    public List<UmsAdminRoleRelation> getUmsAdminRoleRelationList(UmsAdminRoleRelation record) {
        return umsAdminRoleRelationDao.queryAllUmsAdminRoleRelation(record);
    }

    @Override
    public List<UmsAdminRoleRelation> getUmsAdminRoleRelationByPage( UmsAdminRoleRelation record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsAdminRoleRelationDao.queryAllUmsAdminRoleRelation(record);
    }

    @Override
    public UmsAdminRoleRelation getUmsAdminRoleRelationById(Long id) {
        return umsAdminRoleRelationDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsAdminRoleRelation getUmsAdminRoleRelation(UmsAdminRoleRelation record) {
        return umsAdminRoleRelationDao.queryUmsAdminRoleRelation(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsAdminRoleRelation(UmsAdminRoleRelation record) {
        return umsAdminRoleRelationDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsAdminRoleRelationDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsAdminRoleRelation(UmsAdminRoleRelation record) {
        return umsAdminRoleRelationDao.updateByPrimaryKeySelective(record);
    }

}
