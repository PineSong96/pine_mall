package com.pine.mall.core.ums.dao;

import java.util.List;

import com.pine.mall.core.ums.entity.UmsAdminLoginLog;

/**
 * 后台用户登录日志表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsAdminLoginLogDao {

    int deleteById(Long id);

    int insertSelective(UmsAdminLoginLog record);

    UmsAdminLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminLoginLog record);

    List<UmsAdminLoginLog> queryAllUmsAdminLoginLog(UmsAdminLoginLog record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsAdminLoginLog queryUmsAdminLoginLog(UmsAdminLoginLog record);

}
