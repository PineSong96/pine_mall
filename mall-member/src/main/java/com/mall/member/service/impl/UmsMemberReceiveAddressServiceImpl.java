package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsMemberReceiveAddressDao;
import com.mall.core.ums.entity.UmsMemberReceiveAddress;
import com.mall.member.service.UmsMemberReceiveAddressService;

@Service
@Slf4j
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {

    @Autowired
    private UmsMemberReceiveAddressDao umsMemberReceiveAddressDao;

    @Override
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressList(UmsMemberReceiveAddress record) {
        return umsMemberReceiveAddressDao.queryAllUmsMemberReceiveAddress(record);
    }

    @Override
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByPage( UmsMemberReceiveAddress record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsMemberReceiveAddressDao.queryAllUmsMemberReceiveAddress(record);
    }

    @Override
    public UmsMemberReceiveAddress getUmsMemberReceiveAddressById(Long id) {
        return umsMemberReceiveAddressDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsMemberReceiveAddress getUmsMemberReceiveAddress(UmsMemberReceiveAddress record) {
        return umsMemberReceiveAddressDao.queryUmsMemberReceiveAddress(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsMemberReceiveAddress(UmsMemberReceiveAddress record) {
        return umsMemberReceiveAddressDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsMemberReceiveAddressDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsMemberReceiveAddress(UmsMemberReceiveAddress record) {
        return umsMemberReceiveAddressDao.updateByPrimaryKeySelective(record);
    }

}
