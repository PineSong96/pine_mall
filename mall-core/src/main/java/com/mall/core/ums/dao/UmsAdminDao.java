package com.mall.core.ums.dao;

import java.util.List;
import java.util.Map;

import com.mall.core.ums.entity.UmsAdmin;

/**
 * 后台用户表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsAdminDao {

    int deleteById(Long id);

    int insertSelective(UmsAdmin record);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdmin record);

    List<UmsAdmin> queryAllUmsAdmin(UmsAdmin record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsAdmin queryUmsAdmin(UmsAdmin record);

}
