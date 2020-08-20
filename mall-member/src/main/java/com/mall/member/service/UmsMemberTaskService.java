package com.mall.member.service;

import com.mall.core.ums.entity.UmsMemberTask;
import java.util.List;

/**
 * 会员任务表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberTaskService {

    List<UmsMemberTask> getUmsMemberTaskList(UmsMemberTask record);

    List<UmsMemberTask> getUmsMemberTaskByPage(UmsMemberTask record, Integer pageSize, Integer pageNum);

    UmsMemberTask getUmsMemberTaskById(Long id);

    UmsMemberTask getUmsMemberTask(UmsMemberTask record);

    int createUmsMemberTask(UmsMemberTask record);

    int delete(Long id);

    int updateUmsMemberTask(UmsMemberTask record);

}

