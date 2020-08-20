package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsPermissionDao;
import com.mall.core.ums.entity.UmsPermission;
import com.mall.member.service.UmsPermissionService;

@Service
@Slf4j
public class UmsPermissionServiceImpl implements UmsPermissionService {

    @Autowired
    private UmsPermissionDao umsPermissionDao;

    @Override
    public List<UmsPermission> getUmsPermissionList(UmsPermission record) {
        return umsPermissionDao.queryAllUmsPermission(record);
    }

    @Override
    public List<UmsPermission> getUmsPermissionByPage( UmsPermission record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsPermissionDao.queryAllUmsPermission(record);
    }

    @Override
    public UmsPermission getUmsPermissionById(Long id) {
        return umsPermissionDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsPermission getUmsPermission(UmsPermission record) {
        return umsPermissionDao.queryUmsPermission(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsPermission(UmsPermission record) {
        return umsPermissionDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsPermissionDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsPermission(UmsPermission record) {
        return umsPermissionDao.updateByPrimaryKeySelective(record);
    }

}
