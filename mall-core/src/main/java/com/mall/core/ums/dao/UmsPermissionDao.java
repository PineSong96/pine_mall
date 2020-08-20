package com.mall.core.ums.dao;

import java.util.List;
import java.util.Map;

import com.mall.core.ums.entity.UmsPermission;

/**
 * 后台用户权限表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsPermissionDao {

    int deleteById(Long id);

    int insertSelective(UmsPermission record);

    UmsPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsPermission record);

    List<UmsPermission> queryAllUmsPermission(UmsPermission record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsPermission queryUmsPermission(UmsPermission record);

}
