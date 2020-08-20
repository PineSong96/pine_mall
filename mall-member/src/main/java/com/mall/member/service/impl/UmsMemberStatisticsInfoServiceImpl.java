package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsMemberStatisticsInfoDao;
import com.mall.core.ums.entity.UmsMemberStatisticsInfo;
import com.mall.member.service.UmsMemberStatisticsInfoService;

@Service
@Slf4j
public class UmsMemberStatisticsInfoServiceImpl implements UmsMemberStatisticsInfoService {

    @Autowired
    private UmsMemberStatisticsInfoDao umsMemberStatisticsInfoDao;

    @Override
    public List<UmsMemberStatisticsInfo> getUmsMemberStatisticsInfoList(UmsMemberStatisticsInfo record) {
        return umsMemberStatisticsInfoDao.queryAllUmsMemberStatisticsInfo(record);
    }

    @Override
    public List<UmsMemberStatisticsInfo> getUmsMemberStatisticsInfoByPage( UmsMemberStatisticsInfo record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsMemberStatisticsInfoDao.queryAllUmsMemberStatisticsInfo(record);
    }

    @Override
    public UmsMemberStatisticsInfo getUmsMemberStatisticsInfoById(Long id) {
        return umsMemberStatisticsInfoDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsMemberStatisticsInfo getUmsMemberStatisticsInfo(UmsMemberStatisticsInfo record) {
        return umsMemberStatisticsInfoDao.queryUmsMemberStatisticsInfo(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsMemberStatisticsInfo(UmsMemberStatisticsInfo record) {
        return umsMemberStatisticsInfoDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsMemberStatisticsInfoDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsMemberStatisticsInfo(UmsMemberStatisticsInfo record) {
        return umsMemberStatisticsInfoDao.updateByPrimaryKeySelective(record);
    }

}
