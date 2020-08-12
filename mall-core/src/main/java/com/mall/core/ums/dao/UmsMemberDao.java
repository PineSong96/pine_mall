package com.mall.core.ums.dao;

import java.util.List;

import com.mall.core.ums.entity.UmsMember;

/**
 * 会员表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-12 15:26:00
 */
public interface UmsMemberDao {

    int deleteById(Long id);

    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    List<UmsMember> queryAllUmsMember(UmsMember record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsMember queryUmsMember(UmsMember record);

}
