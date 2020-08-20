package com.mall.core.ums.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员与产品分类关系表（用户喜欢的分类）
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:03:26
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "会员与产品分类关系表（用户喜欢的分类）", description = "会员与产品分类关系表（用户喜欢的分类）")
public class UmsMemberProduccategoryRelation implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "memberId")
    private Long memberId;
    @ApiModelProperty(value = "", name = "productCategoryId")
    private Long productCategoryId;

}
