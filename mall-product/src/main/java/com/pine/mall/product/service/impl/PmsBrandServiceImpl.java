package com.pine.mall.product.service.impl;

import com.pine.mall.admin.dto.PmsBrandParam;
import com.pine.mall.admin.service.PmsBrandService;
import com.pine.mall.core.pms.dao.PmsBrandDao;
import com.pine.mall.core.pms.entity.PmsBrand;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;


@Service
@Slf4j
public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    private PmsBrandDao pmsBrandDao;

    @Override
    public List<PmsBrand> getPmsBrandList(PmsBrand record) {
        return pmsBrandDao.queryAllPmsBrand(record);
    }

    @Override
    public List<PmsBrand> getPmsBrandByPage(PmsBrandParam record, Integer pageSize, Integer pageNum) {
        PmsBrand pmsBrand = new PmsBrand();

        PageHelper.startPage(pageNum, pageSize);

        BeanUtils.copyProperties(record, pmsBrand);

        return pmsBrandDao.queryAllPmsBrand(pmsBrand);
    }

    @Override
    public PmsBrand getPmsBrandById(Long id) {
        return pmsBrandDao.selectByPrimaryKey(id);
    }

    @Override
    public PmsBrand getPmsBrand(PmsBrand record) {
        return pmsBrandDao.queryPmsBrand(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createPmsBrand(PmsBrand record) {
        return pmsBrandDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return pmsBrandDao.deleteById(id);
    }

    @Override
    @Transactional
    public int updatePmsBrand(PmsBrand record) {
        return pmsBrandDao.updateByPrimaryKeySelective(record);
    }

}
