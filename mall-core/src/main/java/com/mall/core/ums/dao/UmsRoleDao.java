package com.mall.core.ums.dao;

import java.util.List;
import java.util.Map;

import com.mall.core.ums.entity.UmsRole;

/**
 * 后台用户角色表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsRoleDao {

    int deleteById(Long id);

    int insertSelective(UmsRole record);

    UmsRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsRole record);

    List<UmsRole> queryAllUmsRole(UmsRole record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsRole queryUmsRole(UmsRole record);

}
