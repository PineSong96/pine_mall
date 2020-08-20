package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsAdminPermissionRelationDao;
import com.mall.core.ums.entity.UmsAdminPermissionRelation;
import com.mall.member.service.UmsAdminPermissionRelationService;

@Service
@Slf4j
public class UmsAdminPermissionRelationServiceImpl implements UmsAdminPermissionRelationService {

    @Autowired
    private UmsAdminPermissionRelationDao umsAdminPermissionRelationDao;

    @Override
    public List<UmsAdminPermissionRelation> getUmsAdminPermissionRelationList(UmsAdminPermissionRelation record) {
        return umsAdminPermissionRelationDao.queryAllUmsAdminPermissionRelation(record);
    }

    @Override
    public List<UmsAdminPermissionRelation> getUmsAdminPermissionRelationByPage( UmsAdminPermissionRelation record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsAdminPermissionRelationDao.queryAllUmsAdminPermissionRelation(record);
    }

    @Override
    public UmsAdminPermissionRelation getUmsAdminPermissionRelationById(Long id) {
        return umsAdminPermissionRelationDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsAdminPermissionRelation getUmsAdminPermissionRelation(UmsAdminPermissionRelation record) {
        return umsAdminPermissionRelationDao.queryUmsAdminPermissionRelation(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsAdminPermissionRelation(UmsAdminPermissionRelation record) {
        return umsAdminPermissionRelationDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsAdminPermissionRelationDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsAdminPermissionRelation(UmsAdminPermissionRelation record) {
        return umsAdminPermissionRelationDao.updateByPrimaryKeySelective(record);
    }

}
