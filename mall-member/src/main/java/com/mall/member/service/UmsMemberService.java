package com.mall.member.service;

import com.mall.core.ums.entity.UmsMember;
import java.util.List;

/**
 * 会员表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-19 17:51:03
 */
public interface UmsMemberService {

    List<UmsMember> getUmsMemberList(UmsMember record);

    List<UmsMember> getUmsMemberByPage(UmsMember record, Integer pageSize, Integer pageNum);

    UmsMember getUmsMemberById(Long id);

    UmsMember getUmsMember(UmsMember record);

    int createUmsMember(UmsMember record);

    int delete(Long id);

    int updateUmsMember(UmsMember record);

}

