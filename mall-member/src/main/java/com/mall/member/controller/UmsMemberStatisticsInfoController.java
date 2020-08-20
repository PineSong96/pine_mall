package com.mall.member.controller;

import java.util.List;
import com.mall.common.api.CommonPage;
import com.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mall.core.ums.entity.UmsMemberStatisticsInfo;
import com.mall.member.service.UmsMemberStatisticsInfoService;

/**
 * 会员统计信息
 *
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
@Api(value = "会员统计信息接口", tags = {"会员统计信息接口" })
@RestController
@RequestMapping("ums/UmsMemberStatisticsInfo")
public class UmsMemberStatisticsInfoController {

    @Autowired
    private UmsMemberStatisticsInfoService umsMemberStatisticsInfoService;

    /**
     * <p>获取全部记录。</p>
     */
    @ApiOperation(value = "获取所有会员统计信息数据", notes = "可以根据条件获取")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public CommonResult<List<UmsMemberStatisticsInfo>> all(UmsMemberStatisticsInfo record) {
        List<UmsMemberStatisticsInfo> UmsMemberStatisticsInfoList = umsMemberStatisticsInfoService.getUmsMemberStatisticsInfoList(record);
        return CommonResult.success(UmsMemberStatisticsInfoList);
    }

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取会员统计信息数据", notes = "根据id来获取会员统计信息详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getUmsMemberStatisticsInfo(@PathVariable("id") Long id) {
        UmsMemberStatisticsInfo data = umsMemberStatisticsInfoService.getUmsMemberStatisticsInfoById(id);
        return CommonResult.success(data);
    }

    /**
     * <p>根据条件获取。</p>
     */
    @ApiOperation(value = "获取会员统计信息数据", notes = "根据条件获取")
    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public CommonResult getOne(UmsMemberStatisticsInfo record) {

        UmsMemberStatisticsInfo data = umsMemberStatisticsInfoService.getUmsMemberStatisticsInfo(record);

        return CommonResult.success(data);
    }

    /**
     * <p>分页查询。</p>
     */
    @ApiOperation(value = "分页获取会员统计信息数据", notes = "根据条件获取")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<UmsMemberStatisticsInfo>> page(UmsMemberStatisticsInfo record,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsMemberStatisticsInfo> UmsMemberStatisticsInfoList = umsMemberStatisticsInfoService.getUmsMemberStatisticsInfoList(record);
        return CommonResult.success(CommonPage.restPage(UmsMemberStatisticsInfoList));
    }

    /**
     * <p>保存。</p>
     */
    @ApiOperation(value = "新增一条会员统计信息数据", notes = "新增一条会员统计信息数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsMemberStatisticsInfo record) {

        int count = umsMemberStatisticsInfoService.createUmsMemberStatisticsInfo(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条会员统计信息数据", notes = "更新一条会员统计信息数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updateUmsMemberStatisticsInfo(@RequestBody UmsMemberStatisticsInfo record) {

        int count = umsMemberStatisticsInfoService.updateUmsMemberStatisticsInfo(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>删除。</p>
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除一条会员统计信息数据", notes = "根据Id一条会员统计信息数据")
    public CommonResult deleteUmsMemberStatisticsInfo(@PathVariable("id") Long id) {

        int count = umsMemberStatisticsInfoService.delete(id);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
