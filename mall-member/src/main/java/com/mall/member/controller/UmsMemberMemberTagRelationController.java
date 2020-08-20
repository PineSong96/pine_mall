package com.mall.member.controller;

import java.util.List;
import com.mall.common.api.CommonPage;
import com.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mall.core.ums.entity.UmsMemberMemberTagRelation;
import com.mall.member.service.UmsMemberMemberTagRelationService;

/**
 * 用户和标签关系表
 *
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
@Api(value = "用户和标签关系表接口", tags = {"用户和标签关系表接口" })
@RestController
@RequestMapping("ums/UmsMemberMemberTagRelation")
public class UmsMemberMemberTagRelationController {

    @Autowired
    private UmsMemberMemberTagRelationService umsMemberMemberTagRelationService;

    /**
     * <p>获取全部记录。</p>
     */
    @ApiOperation(value = "获取所有用户和标签关系表数据", notes = "可以根据条件获取")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public CommonResult<List<UmsMemberMemberTagRelation>> all(UmsMemberMemberTagRelation record) {
        List<UmsMemberMemberTagRelation> UmsMemberMemberTagRelationList = umsMemberMemberTagRelationService.getUmsMemberMemberTagRelationList(record);
        return CommonResult.success(UmsMemberMemberTagRelationList);
    }

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取用户和标签关系表数据", notes = "根据id来获取用户和标签关系表详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getUmsMemberMemberTagRelation(@PathVariable("id") Long id) {
        UmsMemberMemberTagRelation data = umsMemberMemberTagRelationService.getUmsMemberMemberTagRelationById(id);
        return CommonResult.success(data);
    }

    /**
     * <p>根据条件获取。</p>
     */
    @ApiOperation(value = "获取用户和标签关系表数据", notes = "根据条件获取")
    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public CommonResult getOne(UmsMemberMemberTagRelation record) {

        UmsMemberMemberTagRelation data = umsMemberMemberTagRelationService.getUmsMemberMemberTagRelation(record);

        return CommonResult.success(data);
    }

    /**
     * <p>分页查询。</p>
     */
    @ApiOperation(value = "分页获取用户和标签关系表数据", notes = "根据条件获取")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<UmsMemberMemberTagRelation>> page(UmsMemberMemberTagRelation record,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsMemberMemberTagRelation> UmsMemberMemberTagRelationList = umsMemberMemberTagRelationService.getUmsMemberMemberTagRelationList(record);
        return CommonResult.success(CommonPage.restPage(UmsMemberMemberTagRelationList));
    }

    /**
     * <p>保存。</p>
     */
    @ApiOperation(value = "新增一条用户和标签关系表数据", notes = "新增一条用户和标签关系表数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsMemberMemberTagRelation record) {

        int count = umsMemberMemberTagRelationService.createUmsMemberMemberTagRelation(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条用户和标签关系表数据", notes = "更新一条用户和标签关系表数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updateUmsMemberMemberTagRelation(@RequestBody UmsMemberMemberTagRelation record) {

        int count = umsMemberMemberTagRelationService.updateUmsMemberMemberTagRelation(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>删除。</p>
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除一条用户和标签关系表数据", notes = "根据Id一条用户和标签关系表数据")
    public CommonResult deleteUmsMemberMemberTagRelation(@PathVariable("id") Long id) {

        int count = umsMemberMemberTagRelationService.delete(id);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
