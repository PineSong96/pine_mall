package com.pine.mall.core.ums.dao;

import java.util.List;

import com.pine.mall.core.ums.entity.UmsMember;

/**
 * 会员表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-12 15:26:00
 */
public interface UmsMemberDao {

    int delete(Long id);

    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    List<UmsMember> queryAllUmsMember(UmsMember record);

    UmsMember queryUmsMember(UmsMember record);

}
