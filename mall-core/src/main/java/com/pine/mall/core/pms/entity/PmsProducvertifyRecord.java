package com.pine.mall.core.pms.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品审核记录
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:40
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "商品审核记录", description = "商品审核记录")
public class PmsProducvertifyRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "productId")
    private Long productId;
    @ApiModelProperty(value = "", name = "createTime")
    private Date createTime;
    @ApiModelProperty(value = "审核人", name = "vertifyMan")
    private String vertifyMan;
    @ApiModelProperty(value = "", name = "status")
    private Integer status;
    @ApiModelProperty(value = "反馈详情", name = "detail")
    private String detail;

}
