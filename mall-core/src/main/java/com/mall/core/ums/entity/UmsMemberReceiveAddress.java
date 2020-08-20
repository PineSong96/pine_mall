package com.mall.core.ums.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员收货地址表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:03:26
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "会员收货地址表", description = "会员收货地址表")
public class UmsMemberReceiveAddress implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "memberId")
    private Long memberId;
    @ApiModelProperty(value = "收货人名称", name = "name")
    private String name;
    @ApiModelProperty(value = "", name = "phoneNumber")
    private String phoneNumber;
    @ApiModelProperty(value = "是否为默认", name = "defaultStatus")
    private Integer defaultStatus;
    @ApiModelProperty(value = "邮政编码", name = "postCode")
    private String postCode;
    @ApiModelProperty(value = "省份/直辖市", name = "province")
    private String province;
    @ApiModelProperty(value = "城市", name = "city")
    private String city;
    @ApiModelProperty(value = "区", name = "region")
    private String region;
    @ApiModelProperty(value = "详细地址(街道)", name = "detailAddress")
    private String detailAddress;

}
