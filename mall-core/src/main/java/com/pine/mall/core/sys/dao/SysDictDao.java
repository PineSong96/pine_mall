package com.pine.mall.core.sys.dao;

import java.util.List;
import com.pine.mall.core.sys.entity.SysDict;

/**
 * 系统字典表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-24 14:32:58
 */
public interface SysDictDao {

    int delete(Long id);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDict record);

    List<SysDict> queryAllSysDict(SysDict record);


    SysDict querySysDict(SysDict record);

}
