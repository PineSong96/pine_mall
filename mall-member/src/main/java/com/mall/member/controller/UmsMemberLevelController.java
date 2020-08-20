package com.mall.member.controller;

import java.util.List;
import com.mall.common.api.CommonPage;
import com.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mall.core.ums.entity.UmsMemberLevel;
import com.mall.member.service.UmsMemberLevelService;

/**
 * 会员等级表
 *
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
@Api(value = "会员等级表接口", tags = {"会员等级表接口" })
@RestController
@RequestMapping("ums/UmsMemberLevel")
public class UmsMemberLevelController {

    @Autowired
    private UmsMemberLevelService umsMemberLevelService;

    /**
     * <p>获取全部记录。</p>
     */
    @ApiOperation(value = "获取所有会员等级表数据", notes = "可以根据条件获取")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public CommonResult<List<UmsMemberLevel>> all(UmsMemberLevel record) {
        List<UmsMemberLevel> UmsMemberLevelList = umsMemberLevelService.getUmsMemberLevelList(record);
        return CommonResult.success(UmsMemberLevelList);
    }

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取会员等级表数据", notes = "根据id来获取会员等级表详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getUmsMemberLevel(@PathVariable("id") Long id) {
        UmsMemberLevel data = umsMemberLevelService.getUmsMemberLevelById(id);
        return CommonResult.success(data);
    }

    /**
     * <p>根据条件获取。</p>
     */
    @ApiOperation(value = "获取会员等级表数据", notes = "根据条件获取")
    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public CommonResult getOne(UmsMemberLevel record) {

        UmsMemberLevel data = umsMemberLevelService.getUmsMemberLevel(record);

        return CommonResult.success(data);
    }

    /**
     * <p>分页查询。</p>
     */
    @ApiOperation(value = "分页获取会员等级表数据", notes = "根据条件获取")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<UmsMemberLevel>> page(UmsMemberLevel record,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsMemberLevel> UmsMemberLevelList = umsMemberLevelService.getUmsMemberLevelList(record);
        return CommonResult.success(CommonPage.restPage(UmsMemberLevelList));
    }

    /**
     * <p>保存。</p>
     */
    @ApiOperation(value = "新增一条会员等级表数据", notes = "新增一条会员等级表数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsMemberLevel record) {

        int count = umsMemberLevelService.createUmsMemberLevel(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条会员等级表数据", notes = "更新一条会员等级表数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updateUmsMemberLevel(@RequestBody UmsMemberLevel record) {

        int count = umsMemberLevelService.updateUmsMemberLevel(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>删除。</p>
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除一条会员等级表数据", notes = "根据Id一条会员等级表数据")
    public CommonResult deleteUmsMemberLevel(@PathVariable("id") Long id) {

        int count = umsMemberLevelService.delete(id);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
