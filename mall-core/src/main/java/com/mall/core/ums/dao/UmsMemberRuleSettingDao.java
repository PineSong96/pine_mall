package com.mall.core.ums.dao;

import java.util.List;
import java.util.Map;

import com.mall.core.ums.entity.UmsMemberRuleSetting;

/**
 * 会员积分成长规则表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberRuleSettingDao {

    int deleteById(Long id);

    int insertSelective(UmsMemberRuleSetting record);

    UmsMemberRuleSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberRuleSetting record);

    List<UmsMemberRuleSetting> queryAllUmsMemberRuleSetting(UmsMemberRuleSetting record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsMemberRuleSetting queryUmsMemberRuleSetting(UmsMemberRuleSetting record);

}
