package com.mall.core.sys.service;


import com.mall.core.sys.entity.SysDict;

import java.util.List;

/**
 * 系统字典表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-24 14:32:58
 */
public interface SysDictService {

    List<SysDict> getSysDictList(SysDict record);

    List<SysDict> getSysDictByPage(SysDict record, Integer pageSize, Integer pageNum);

    SysDict getSysDictById(Long id);

    SysDict getSysDict(SysDict record);

    int createSysDict(SysDict record);

    int delete(Long id);

    int updateSysDict(SysDict record);

}
