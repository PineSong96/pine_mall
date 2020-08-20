package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsRolePermissionRelationDao;
import com.mall.core.ums.entity.UmsRolePermissionRelation;
import com.mall.member.service.UmsRolePermissionRelationService;

@Service
@Slf4j
public class UmsRolePermissionRelationServiceImpl implements UmsRolePermissionRelationService {

    @Autowired
    private UmsRolePermissionRelationDao umsRolePermissionRelationDao;

    @Override
    public List<UmsRolePermissionRelation> getUmsRolePermissionRelationList(UmsRolePermissionRelation record) {
        return umsRolePermissionRelationDao.queryAllUmsRolePermissionRelation(record);
    }

    @Override
    public List<UmsRolePermissionRelation> getUmsRolePermissionRelationByPage( UmsRolePermissionRelation record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsRolePermissionRelationDao.queryAllUmsRolePermissionRelation(record);
    }

    @Override
    public UmsRolePermissionRelation getUmsRolePermissionRelationById(Long id) {
        return umsRolePermissionRelationDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsRolePermissionRelation getUmsRolePermissionRelation(UmsRolePermissionRelation record) {
        return umsRolePermissionRelationDao.queryUmsRolePermissionRelation(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsRolePermissionRelation(UmsRolePermissionRelation record) {
        return umsRolePermissionRelationDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsRolePermissionRelationDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsRolePermissionRelation(UmsRolePermissionRelation record) {
        return umsRolePermissionRelationDao.updateByPrimaryKeySelective(record);
    }

}
