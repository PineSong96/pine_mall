package com.pine.mall.core.ums.dao;

import java.util.List;

import com.pine.mall.core.ums.entity.UmsMemberStatisticsInfo;

/**
 * 会员统计信息
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberStatisticsInfoDao {

    int deleteById(Long id);

    int insertSelective(UmsMemberStatisticsInfo record);

    UmsMemberStatisticsInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberStatisticsInfo record);

    List<UmsMemberStatisticsInfo> queryAllUmsMemberStatisticsInfo(UmsMemberStatisticsInfo record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsMemberStatisticsInfo queryUmsMemberStatisticsInfo(UmsMemberStatisticsInfo record);

}
