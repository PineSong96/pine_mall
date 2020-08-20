package com.mall.member.service;

import com.mall.core.ums.entity.UmsMemberRuleSetting;
import java.util.List;

/**
 * 会员积分成长规则表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberRuleSettingService {

    List<UmsMemberRuleSetting> getUmsMemberRuleSettingList(UmsMemberRuleSetting record);

    List<UmsMemberRuleSetting> getUmsMemberRuleSettingByPage(UmsMemberRuleSetting record, Integer pageSize, Integer pageNum);

    UmsMemberRuleSetting getUmsMemberRuleSettingById(Long id);

    UmsMemberRuleSetting getUmsMemberRuleSetting(UmsMemberRuleSetting record);

    int createUmsMemberRuleSetting(UmsMemberRuleSetting record);

    int delete(Long id);

    int updateUmsMemberRuleSetting(UmsMemberRuleSetting record);

}

