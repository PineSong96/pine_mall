package com.mall.core.ums.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员任务表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-08-20 15:03:26
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "会员任务表", description = "会员任务表")
public class UmsMemberTask implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "name")
    private String name;
    @ApiModelProperty(value = "赠送成长值", name = "growth")
    private Integer growth;
    @ApiModelProperty(value = "赠送积分", name = "intergration")
    private Integer intergration;
    @ApiModelProperty(value = "任务类型：0->新手任务；1->日常任务", name = "type")
    private Integer type;

}
