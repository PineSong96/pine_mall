package com.pine.mall.core.pms.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品信息
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:40
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "商品信息", description = "商品信息")
public class PmsProduct implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "brandId")
    private Long brandId;
    @ApiModelProperty(value = "", name = "productCategoryId")
    private Long productCategoryId;
    @ApiModelProperty(value = "", name = "feightTemplateId")
    private Long feightTemplateId;
    @ApiModelProperty(value = "", name = "productAttributeCategoryId")
    private Long productAttributeCategoryId;
    @ApiModelProperty(value = "", name = "name")
    private String name;
    @ApiModelProperty(value = "", name = "pic")
    private String pic;
    @ApiModelProperty(value = "货号", name = "productSn")
    private String productSn;
    @ApiModelProperty(value = "删除状态：0->未删除；1->已删除", name = "deleteStatus")
    private Integer deleteStatus;
    @ApiModelProperty(value = "上架状态：0->下架；1->上架", name = "publishStatus")
    private Integer publishStatus;
    @ApiModelProperty(value = "新品状态:0->不是新品；1->新品", name = "newStatus")
    private Integer newStatus;
    @ApiModelProperty(value = "推荐状态；0->不推荐；1->推荐", name = "recommandStatus")
    private Integer recommandStatus;
    @ApiModelProperty(value = "审核状态：0->未审核；1->审核通过", name = "verifyStatus")
    private Integer verifyStatus;
    @ApiModelProperty(value = "排序", name = "sort")
    private Integer sort;
    @ApiModelProperty(value = "销量", name = "sale")
    private Integer sale;
    @ApiModelProperty(value = "", name = "price")
    private BigDecimal price;
    @ApiModelProperty(value = "促销价格", name = "promotionPrice")
    private BigDecimal promotionPrice;
    @ApiModelProperty(value = "赠送的成长值", name = "giftGrowth")
    private Integer giftGrowth;
    @ApiModelProperty(value = "赠送的积分", name = "giftPoint")
    private Integer giftPoint;
    @ApiModelProperty(value = "限制使用的积分数", name = "usePointLimit")
    private Integer usePointLimit;
    @ApiModelProperty(value = "副标题", name = "subTitle")
    private String subTitle;
    @ApiModelProperty(value = "商品描述", name = "description")
    private String description;
    @ApiModelProperty(value = "市场价", name = "originalPrice")
    private BigDecimal originalPrice;
    @ApiModelProperty(value = "库存", name = "stock")
    private Integer stock;
    @ApiModelProperty(value = "库存预警值", name = "lowStock")
    private Integer lowStock;
    @ApiModelProperty(value = "单位", name = "unit")
    private String unit;
    @ApiModelProperty(value = "商品重量，默认为克", name = "weight")
    private BigDecimal weight;
    @ApiModelProperty(value = "是否为预告商品：0->不是；1->是", name = "previewStatus")
    private Integer previewStatus;
    @ApiModelProperty(value = "以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮", name = "serviceIds")
    private String serviceIds;
    @ApiModelProperty(value = "", name = "keywords")
    private String keywords;
    @ApiModelProperty(value = "", name = "note")
    private String note;
    @ApiModelProperty(value = "画册图片，连产品图片限制为5张，以逗号分割", name = "albumPics")
    private String albumPics;
    @ApiModelProperty(value = "", name = "detailTitle")
    private String detailTitle;
    @ApiModelProperty(value = "", name = "detailDesc")
    private String detailDesc;
    @ApiModelProperty(value = "产品详情网页内容", name = "detailHtml")
    private String detailHtml;
    @ApiModelProperty(value = "移动端网页详情", name = "detailMobileHtml")
    private String detailMobileHtml;
    @ApiModelProperty(value = "促销开始时间", name = "promotionStartTime")
    private Date promotionStartTime;
    @ApiModelProperty(value = "促销结束时间", name = "promotionEndTime")
    private Date promotionEndTime;
    @ApiModelProperty(value = "活动限购数量", name = "promotionPerLimit")
    private Integer promotionPerLimit;
    @ApiModelProperty(value = "促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购", name = "promotionType")
    private Integer promotionType;
    @ApiModelProperty(value = "品牌名称", name = "brandName")
    private String brandName;
    @ApiModelProperty(value = "商品分类名称", name = "productCategoryName")
    private String productCategoryName;

}
