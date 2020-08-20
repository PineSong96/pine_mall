package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsRoleDao;
import com.mall.core.ums.entity.UmsRole;
import com.mall.member.service.UmsRoleService;

@Service
@Slf4j
public class UmsRoleServiceImpl implements UmsRoleService {

    @Autowired
    private UmsRoleDao umsRoleDao;

    @Override
    public List<UmsRole> getUmsRoleList(UmsRole record) {
        return umsRoleDao.queryAllUmsRole(record);
    }

    @Override
    public List<UmsRole> getUmsRoleByPage( UmsRole record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsRoleDao.queryAllUmsRole(record);
    }

    @Override
    public UmsRole getUmsRoleById(Long id) {
        return umsRoleDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsRole getUmsRole(UmsRole record) {
        return umsRoleDao.queryUmsRole(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsRole(UmsRole record) {
        return umsRoleDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsRoleDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsRole(UmsRole record) {
        return umsRoleDao.updateByPrimaryKeySelective(record);
    }

}
