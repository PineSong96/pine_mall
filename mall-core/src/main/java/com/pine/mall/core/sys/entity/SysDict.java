package com.pine.mall.core.sys.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统字典表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-08-24 14:32:58
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "系统字典表", description = "系统字典表")
public class SysDict implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id", name = "id")
    private Long id;
    @ApiModelProperty(value = " 父ID ", name = "pid")
    private Long pid;
    @ApiModelProperty(value = " 数据类别,首字母大写 ", name = "datatype")
    private String datatype;
    @ApiModelProperty(value = " 数据编码 ", name = "datacode")
    private String datacode;
    @ApiModelProperty(value = " 数据名称/值 ", name = "datavalue")
    private String datavalue;
    @ApiModelProperty(value = " 顺序 ", name = "sortno")
    private Integer sortno;
    @ApiModelProperty(value = "0正常,1删除", name = "status")
    private Integer status;
    @ApiModelProperty(value = "0默认为不固定,1固定", name = "isfixed")
    private Integer isfixed;
    @ApiModelProperty(value = "数据描述", name = "datadesc")
    private String datadesc;
    @ApiModelProperty(value = "", name = "updatetime")
    private Date updatetime;

}
