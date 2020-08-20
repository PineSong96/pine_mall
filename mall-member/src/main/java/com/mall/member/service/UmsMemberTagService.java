package com.mall.member.service;

import com.mall.core.ums.entity.UmsMemberTag;
import java.util.List;

/**
 * 用户标签表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberTagService {

    List<UmsMemberTag> getUmsMemberTagList(UmsMemberTag record);

    List<UmsMemberTag> getUmsMemberTagByPage(UmsMemberTag record, Integer pageSize, Integer pageNum);

    UmsMemberTag getUmsMemberTagById(Long id);

    UmsMemberTag getUmsMemberTag(UmsMemberTag record);

    int createUmsMemberTag(UmsMemberTag record);

    int delete(Long id);

    int updateUmsMemberTag(UmsMemberTag record);

}

