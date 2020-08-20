package com.mall.member.service;

import com.mall.core.ums.entity.UmsMemberProduccategoryRelation;
import java.util.List;

/**
 * 会员与产品分类关系表（用户喜欢的分类）
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberProduccategoryRelationService {

    List<UmsMemberProduccategoryRelation> getUmsMemberProduccategoryRelationList(UmsMemberProduccategoryRelation record);

    List<UmsMemberProduccategoryRelation> getUmsMemberProduccategoryRelationByPage(UmsMemberProduccategoryRelation record, Integer pageSize, Integer pageNum);

    UmsMemberProduccategoryRelation getUmsMemberProduccategoryRelationById(Long id);

    UmsMemberProduccategoryRelation getUmsMemberProduccategoryRelation(UmsMemberProduccategoryRelation record);

    int createUmsMemberProduccategoryRelation(UmsMemberProduccategoryRelation record);

    int delete(Long id);

    int updateUmsMemberProduccategoryRelation(UmsMemberProduccategoryRelation record);

}

