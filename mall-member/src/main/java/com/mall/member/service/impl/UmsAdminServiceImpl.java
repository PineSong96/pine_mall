package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsAdminDao;
import com.mall.core.ums.entity.UmsAdmin;
import com.mall.member.service.UmsAdminService;

@Service
@Slf4j
public class UmsAdminServiceImpl implements UmsAdminService {

    @Autowired
    private UmsAdminDao umsAdminDao;

    @Override
    public List<UmsAdmin> getUmsAdminList(UmsAdmin record) {
        return umsAdminDao.queryAllUmsAdmin(record);
    }

    @Override
    public List<UmsAdmin> getUmsAdminByPage( UmsAdmin record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsAdminDao.queryAllUmsAdmin(record);
    }

    @Override
    public UmsAdmin getUmsAdminById(Long id) {
        return umsAdminDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsAdmin getUmsAdmin(UmsAdmin record) {
        return umsAdminDao.queryUmsAdmin(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsAdmin(UmsAdmin record) {
        return umsAdminDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsAdminDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsAdmin(UmsAdmin record) {
        return umsAdminDao.updateByPrimaryKeySelective(record);
    }

}
