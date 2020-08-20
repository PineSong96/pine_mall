package com.mall.member.service;

import com.mall.core.ums.entity.UmsAdminLoginLog;
import java.util.List;

/**
 * 后台用户登录日志表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsAdminLoginLogService {

    List<UmsAdminLoginLog> getUmsAdminLoginLogList(UmsAdminLoginLog record);

    List<UmsAdminLoginLog> getUmsAdminLoginLogByPage(UmsAdminLoginLog record, Integer pageSize, Integer pageNum);

    UmsAdminLoginLog getUmsAdminLoginLogById(Long id);

    UmsAdminLoginLog getUmsAdminLoginLog(UmsAdminLoginLog record);

    int createUmsAdminLoginLog(UmsAdminLoginLog record);

    int delete(Long id);

    int updateUmsAdminLoginLog(UmsAdminLoginLog record);

}

