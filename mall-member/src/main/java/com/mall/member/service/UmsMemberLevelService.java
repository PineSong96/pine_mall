package com.mall.member.service;

import com.mall.core.ums.entity.UmsMemberLevel;
import java.util.List;

/**
 * 会员等级表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberLevelService {

    List<UmsMemberLevel> getUmsMemberLevelList(UmsMemberLevel record);

    List<UmsMemberLevel> getUmsMemberLevelByPage(UmsMemberLevel record, Integer pageSize, Integer pageNum);

    UmsMemberLevel getUmsMemberLevelById(Long id);

    UmsMemberLevel getUmsMemberLevel(UmsMemberLevel record);

    int createUmsMemberLevel(UmsMemberLevel record);

    int delete(Long id);

    int updateUmsMemberLevel(UmsMemberLevel record);

}

