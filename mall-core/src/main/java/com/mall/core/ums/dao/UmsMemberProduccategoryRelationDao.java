package com.mall.core.ums.dao;

import java.util.List;
import java.util.Map;

import com.mall.core.ums.entity.UmsMemberProduccategoryRelation;

/**
 * 会员与产品分类关系表（用户喜欢的分类）
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberProduccategoryRelationDao {

    int deleteById(Long id);

    int insertSelective(UmsMemberProduccategoryRelation record);

    UmsMemberProduccategoryRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberProduccategoryRelation record);

    List<UmsMemberProduccategoryRelation> queryAllUmsMemberProduccategoryRelation(UmsMemberProduccategoryRelation record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsMemberProduccategoryRelation queryUmsMemberProduccategoryRelation(UmsMemberProduccategoryRelation record);

}
