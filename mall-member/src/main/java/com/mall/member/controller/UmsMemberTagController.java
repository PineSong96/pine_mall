package com.mall.member.controller;

import java.util.List;
import com.mall.common.api.CommonPage;
import com.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mall.core.ums.entity.UmsMemberTag;
import com.mall.member.service.UmsMemberTagService;

/**
 * 用户标签表
 *
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
@Api(value = "用户标签表接口", tags = {"用户标签表接口" })
@RestController
@RequestMapping("ums/UmsMemberTag")
public class UmsMemberTagController {

    @Autowired
    private UmsMemberTagService umsMemberTagService;

    /**
     * <p>获取全部记录。</p>
     */
    @ApiOperation(value = "获取所有用户标签表数据", notes = "可以根据条件获取")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public CommonResult<List<UmsMemberTag>> all(UmsMemberTag record) {
        List<UmsMemberTag> UmsMemberTagList = umsMemberTagService.getUmsMemberTagList(record);
        return CommonResult.success(UmsMemberTagList);
    }

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取用户标签表数据", notes = "根据id来获取用户标签表详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getUmsMemberTag(@PathVariable("id") Long id) {
        UmsMemberTag data = umsMemberTagService.getUmsMemberTagById(id);
        return CommonResult.success(data);
    }

    /**
     * <p>根据条件获取。</p>
     */
    @ApiOperation(value = "获取用户标签表数据", notes = "根据条件获取")
    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public CommonResult getOne(UmsMemberTag record) {

        UmsMemberTag data = umsMemberTagService.getUmsMemberTag(record);

        return CommonResult.success(data);
    }

    /**
     * <p>分页查询。</p>
     */
    @ApiOperation(value = "分页获取用户标签表数据", notes = "根据条件获取")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<UmsMemberTag>> page(UmsMemberTag record,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsMemberTag> UmsMemberTagList = umsMemberTagService.getUmsMemberTagList(record);
        return CommonResult.success(CommonPage.restPage(UmsMemberTagList));
    }

    /**
     * <p>保存。</p>
     */
    @ApiOperation(value = "新增一条用户标签表数据", notes = "新增一条用户标签表数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsMemberTag record) {

        int count = umsMemberTagService.createUmsMemberTag(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条用户标签表数据", notes = "更新一条用户标签表数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updateUmsMemberTag(@RequestBody UmsMemberTag record) {

        int count = umsMemberTagService.updateUmsMemberTag(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>删除。</p>
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除一条用户标签表数据", notes = "根据Id一条用户标签表数据")
    public CommonResult deleteUmsMemberTag(@PathVariable("id") Long id) {

        int count = umsMemberTagService.delete(id);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
