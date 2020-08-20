package com.mall.core.ums.dao;

import java.util.List;
import java.util.Map;

import com.mall.core.ums.entity.UmsMemberTag;

/**
 * 用户标签表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberTagDao {

    int deleteById(Long id);

    int insertSelective(UmsMemberTag record);

    UmsMemberTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberTag record);

    List<UmsMemberTag> queryAllUmsMemberTag(UmsMemberTag record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsMemberTag queryUmsMemberTag(UmsMemberTag record);

}
