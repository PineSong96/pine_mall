package com.mall.member.service;

import com.mall.core.ums.entity.UmsAdmin;
import java.util.List;

/**
 * 后台用户表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsAdminService {

    List<UmsAdmin> getUmsAdminList(UmsAdmin record);

    List<UmsAdmin> getUmsAdminByPage(UmsAdmin record, Integer pageSize, Integer pageNum);

    UmsAdmin getUmsAdminById(Long id);

    UmsAdmin getUmsAdmin(UmsAdmin record);

    int createUmsAdmin(UmsAdmin record);

    int delete(Long id);

    int updateUmsAdmin(UmsAdmin record);

}

