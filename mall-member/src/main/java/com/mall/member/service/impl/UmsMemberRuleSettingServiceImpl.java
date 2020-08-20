package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsMemberRuleSettingDao;
import com.mall.core.ums.entity.UmsMemberRuleSetting;
import com.mall.member.service.UmsMemberRuleSettingService;

@Service
@Slf4j
public class UmsMemberRuleSettingServiceImpl implements UmsMemberRuleSettingService {

    @Autowired
    private UmsMemberRuleSettingDao umsMemberRuleSettingDao;

    @Override
    public List<UmsMemberRuleSetting> getUmsMemberRuleSettingList(UmsMemberRuleSetting record) {
        return umsMemberRuleSettingDao.queryAllUmsMemberRuleSetting(record);
    }

    @Override
    public List<UmsMemberRuleSetting> getUmsMemberRuleSettingByPage( UmsMemberRuleSetting record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsMemberRuleSettingDao.queryAllUmsMemberRuleSetting(record);
    }

    @Override
    public UmsMemberRuleSetting getUmsMemberRuleSettingById(Long id) {
        return umsMemberRuleSettingDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsMemberRuleSetting getUmsMemberRuleSetting(UmsMemberRuleSetting record) {
        return umsMemberRuleSettingDao.queryUmsMemberRuleSetting(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsMemberRuleSetting(UmsMemberRuleSetting record) {
        return umsMemberRuleSettingDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsMemberRuleSettingDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsMemberRuleSetting(UmsMemberRuleSetting record) {
        return umsMemberRuleSettingDao.updateByPrimaryKeySelective(record);
    }

}
