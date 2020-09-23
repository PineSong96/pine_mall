package com.pine.mall.core.ums.dao;

import java.util.List;

import com.pine.mall.core.ums.entity.UmsMemberTask;

/**
 * 会员任务表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberTaskDao {

    int deleteById(Long id);

    int insertSelective(UmsMemberTask record);

    UmsMemberTask selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberTask record);

    List<UmsMemberTask> queryAllUmsMemberTask(UmsMemberTask record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsMemberTask queryUmsMemberTask(UmsMemberTask record);

}
