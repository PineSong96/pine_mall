package com.mall.core.pms.entity;

import com.drew.imaging.jpeg.JpegMetadataReader;
import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

/**
 * 品牌表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-08-11 11:06:15
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "品牌表", description = "品牌表")
public class PmsBrand implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "name")
    private String name;
    @ApiModelProperty(value = "首字母", name = "firstLetter")
    private String firstLetter;
    @ApiModelProperty(value = "", name = "sort")
    private Integer sort;
    @ApiModelProperty(value = "是否为品牌制造商：0->不是；1->是", name = "factoryStatus")
    private Integer factoryStatus;
    @ApiModelProperty(value = "", name = "showStatus")
    private Integer showStatus;
    @ApiModelProperty(value = "产品数量", name = "productCount")
    private Integer productCount;
    @ApiModelProperty(value = "产品评论数量", name = "productCommentCount")
    private Integer productCommentCount;
    @ApiModelProperty(value = "品牌logo", name = "logo")
    private String logo;
    @ApiModelProperty(value = "专区大图", name = "bigPic")
    private String bigPic;
    @ApiModelProperty(value = "品牌故事", name = "brandStory")
    private String brandStory;

}
