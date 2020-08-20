package com.mall.member.controller;

import java.util.List;
import com.mall.common.api.CommonPage;
import com.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mall.core.ums.entity.UmsMemberProduccategoryRelation;
import com.mall.member.service.UmsMemberProduccategoryRelationService;

/**
 * 会员与产品分类关系表（用户喜欢的分类）
 *
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
@Api(value = "会员与产品分类关系表（用户喜欢的分类）接口", tags = {"会员与产品分类关系表（用户喜欢的分类）接口" })
@RestController
@RequestMapping("ums/UmsMemberProduccategoryRelation")
public class UmsMemberProduccategoryRelationController {

    @Autowired
    private UmsMemberProduccategoryRelationService umsMemberProduccategoryRelationService;

    /**
     * <p>获取全部记录。</p>
     */
    @ApiOperation(value = "获取所有会员与产品分类关系表（用户喜欢的分类）数据", notes = "可以根据条件获取")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public CommonResult<List<UmsMemberProduccategoryRelation>> all(UmsMemberProduccategoryRelation record) {
        List<UmsMemberProduccategoryRelation> UmsMemberProduccategoryRelationList = umsMemberProduccategoryRelationService.getUmsMemberProduccategoryRelationList(record);
        return CommonResult.success(UmsMemberProduccategoryRelationList);
    }

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取会员与产品分类关系表（用户喜欢的分类）数据", notes = "根据id来获取会员与产品分类关系表（用户喜欢的分类）详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getUmsMemberProduccategoryRelation(@PathVariable("id") Long id) {
        UmsMemberProduccategoryRelation data = umsMemberProduccategoryRelationService.getUmsMemberProduccategoryRelationById(id);
        return CommonResult.success(data);
    }

    /**
     * <p>根据条件获取。</p>
     */
    @ApiOperation(value = "获取会员与产品分类关系表（用户喜欢的分类）数据", notes = "根据条件获取")
    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public CommonResult getOne(UmsMemberProduccategoryRelation record) {

        UmsMemberProduccategoryRelation data = umsMemberProduccategoryRelationService.getUmsMemberProduccategoryRelation(record);

        return CommonResult.success(data);
    }

    /**
     * <p>分页查询。</p>
     */
    @ApiOperation(value = "分页获取会员与产品分类关系表（用户喜欢的分类）数据", notes = "根据条件获取")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<UmsMemberProduccategoryRelation>> page(UmsMemberProduccategoryRelation record,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsMemberProduccategoryRelation> UmsMemberProduccategoryRelationList = umsMemberProduccategoryRelationService.getUmsMemberProduccategoryRelationList(record);
        return CommonResult.success(CommonPage.restPage(UmsMemberProduccategoryRelationList));
    }

    /**
     * <p>保存。</p>
     */
    @ApiOperation(value = "新增一条会员与产品分类关系表（用户喜欢的分类）数据", notes = "新增一条会员与产品分类关系表（用户喜欢的分类）数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsMemberProduccategoryRelation record) {

        int count = umsMemberProduccategoryRelationService.createUmsMemberProduccategoryRelation(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条会员与产品分类关系表（用户喜欢的分类）数据", notes = "更新一条会员与产品分类关系表（用户喜欢的分类）数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updateUmsMemberProduccategoryRelation(@RequestBody UmsMemberProduccategoryRelation record) {

        int count = umsMemberProduccategoryRelationService.updateUmsMemberProduccategoryRelation(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>删除。</p>
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除一条会员与产品分类关系表（用户喜欢的分类）数据", notes = "根据Id一条会员与产品分类关系表（用户喜欢的分类）数据")
    public CommonResult deleteUmsMemberProduccategoryRelation(@PathVariable("id") Long id) {

        int count = umsMemberProduccategoryRelationService.delete(id);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
