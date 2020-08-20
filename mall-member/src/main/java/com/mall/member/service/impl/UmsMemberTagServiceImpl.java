package com.mall.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import com.mall.core.ums.dao.UmsMemberTagDao;
import com.mall.core.ums.entity.UmsMemberTag;
import com.mall.member.service.UmsMemberTagService;

@Service
@Slf4j
public class UmsMemberTagServiceImpl implements UmsMemberTagService {

    @Autowired
    private UmsMemberTagDao umsMemberTagDao;

    @Override
    public List<UmsMemberTag> getUmsMemberTagList(UmsMemberTag record) {
        return umsMemberTagDao.queryAllUmsMemberTag(record);
    }

    @Override
    public List<UmsMemberTag> getUmsMemberTagByPage( UmsMemberTag record, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum, pageSize);

        return umsMemberTagDao.queryAllUmsMemberTag(record);
    }

    @Override
    public UmsMemberTag getUmsMemberTagById(Long id) {
        return umsMemberTagDao.selectByPrimaryKey(id);
    }

    @Override
    public UmsMemberTag getUmsMemberTag(UmsMemberTag record) {
        return umsMemberTagDao.queryUmsMemberTag(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createUmsMemberTag(UmsMemberTag record) {
        return umsMemberTagDao.insertSelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return umsMemberTagDao.delete(id);
    }

    @Override
    @Transactional
    public int updateUmsMemberTag(UmsMemberTag record) {
        return umsMemberTagDao.updateByPrimaryKeySelective(record);
    }

}
