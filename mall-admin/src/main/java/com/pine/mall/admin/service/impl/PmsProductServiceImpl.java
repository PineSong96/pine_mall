package com.pine.mall.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pine.mall.admin.service.PmsProductService;
import com.pine.mall.core.pms.dao.PmsProductDao;
import com.pine.mall.core.pms.entity.PmsProduct;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Slf4j
public class PmsProductServiceImpl implements PmsProductService {

    @Autowired
    private PmsProductDao pmsProductDao;

    @Override
    public List<PmsProduct> getPmsProductList(PmsProduct record) {
        return pmsProductDao.queryAllPmsProduct(record);
    }

    @Override
    public List<PmsProduct> getPmsProductByPage( PmsProduct record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return pmsProductDao.queryAllPmsProduct(record);
    }

    @Override
    public PmsProduct getPmsProductById(Long id) {
        return pmsProductDao.selectByPrimaryKey(id);
    }

    @Override
    public PmsProduct getPmsProduct(PmsProduct record) {
        return pmsProductDao.queryPmsProduct(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createPmsProduct(PmsProduct record) {
        return pmsProductDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return pmsProductDao.deleteById(id);
    }

    @Override
    @Transactional
    public int updatePmsProduct(PmsProduct record) {
        return pmsProductDao.updateByPrimaryKeySelective(record);
    }

}
