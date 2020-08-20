package com.mall.member.service;

import com.mall.core.ums.entity.UmsMemberLoginLog;
import java.util.List;

/**
 * 会员登录记录
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberLoginLogService {

    List<UmsMemberLoginLog> getUmsMemberLoginLogList(UmsMemberLoginLog record);

    List<UmsMemberLoginLog> getUmsMemberLoginLogByPage(UmsMemberLoginLog record, Integer pageSize, Integer pageNum);

    UmsMemberLoginLog getUmsMemberLoginLogById(Long id);

    UmsMemberLoginLog getUmsMemberLoginLog(UmsMemberLoginLog record);

    int createUmsMemberLoginLog(UmsMemberLoginLog record);

    int delete(Long id);

    int updateUmsMemberLoginLog(UmsMemberLoginLog record);

}

