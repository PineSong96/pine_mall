package com.mall.core.ums.dao;

import java.util.List;
import java.util.Map;

import com.mall.core.ums.entity.UmsMemberLoginLog;

/**
 * 会员登录记录
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberLoginLogDao {

    int deleteById(Long id);

    int insertSelective(UmsMemberLoginLog record);

    UmsMemberLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLoginLog record);

    List<UmsMemberLoginLog> queryAllUmsMemberLoginLog(UmsMemberLoginLog record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsMemberLoginLog queryUmsMemberLoginLog(UmsMemberLoginLog record);

}
