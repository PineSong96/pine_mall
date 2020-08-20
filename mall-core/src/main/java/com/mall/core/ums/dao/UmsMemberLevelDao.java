package com.mall.core.ums.dao;

import java.util.List;
import java.util.Map;

import com.mall.core.ums.entity.UmsMemberLevel;

/**
 * 会员等级表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberLevelDao {

    int deleteById(Long id);

    int insertSelective(UmsMemberLevel record);

    UmsMemberLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLevel record);

    List<UmsMemberLevel> queryAllUmsMemberLevel(UmsMemberLevel record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsMemberLevel queryUmsMemberLevel(UmsMemberLevel record);

}
