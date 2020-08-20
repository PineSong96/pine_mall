package com.mall.member.service;

import com.mall.core.ums.entity.UmsMemberStatisticsInfo;
import java.util.List;

/**
 * 会员统计信息
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberStatisticsInfoService {

    List<UmsMemberStatisticsInfo> getUmsMemberStatisticsInfoList(UmsMemberStatisticsInfo record);

    List<UmsMemberStatisticsInfo> getUmsMemberStatisticsInfoByPage(UmsMemberStatisticsInfo record, Integer pageSize, Integer pageNum);

    UmsMemberStatisticsInfo getUmsMemberStatisticsInfoById(Long id);

    UmsMemberStatisticsInfo getUmsMemberStatisticsInfo(UmsMemberStatisticsInfo record);

    int createUmsMemberStatisticsInfo(UmsMemberStatisticsInfo record);

    int delete(Long id);

    int updateUmsMemberStatisticsInfo(UmsMemberStatisticsInfo record);

}

