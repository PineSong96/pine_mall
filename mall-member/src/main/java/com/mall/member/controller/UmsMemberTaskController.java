package com.mall.member.controller;

import java.util.List;
import com.mall.common.api.CommonPage;
import com.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mall.core.ums.entity.UmsMemberTask;
import com.mall.member.service.UmsMemberTaskService;

/**
 * 会员任务表
 *
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
@Api(value = "会员任务表接口", tags = {"会员任务表接口" })
@RestController
@RequestMapping("ums/UmsMemberTask")
public class UmsMemberTaskController {

    @Autowired
    private UmsMemberTaskService umsMemberTaskService;

    /**
     * <p>获取全部记录。</p>
     */
    @ApiOperation(value = "获取所有会员任务表数据", notes = "可以根据条件获取")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public CommonResult<List<UmsMemberTask>> all(UmsMemberTask record) {
        List<UmsMemberTask> UmsMemberTaskList = umsMemberTaskService.getUmsMemberTaskList(record);
        return CommonResult.success(UmsMemberTaskList);
    }

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取会员任务表数据", notes = "根据id来获取会员任务表详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getUmsMemberTask(@PathVariable("id") Long id) {
        UmsMemberTask data = umsMemberTaskService.getUmsMemberTaskById(id);
        return CommonResult.success(data);
    }

    /**
     * <p>根据条件获取。</p>
     */
    @ApiOperation(value = "获取会员任务表数据", notes = "根据条件获取")
    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public CommonResult getOne(UmsMemberTask record) {

        UmsMemberTask data = umsMemberTaskService.getUmsMemberTask(record);

        return CommonResult.success(data);
    }

    /**
     * <p>分页查询。</p>
     */
    @ApiOperation(value = "分页获取会员任务表数据", notes = "根据条件获取")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<UmsMemberTask>> page(UmsMemberTask record,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsMemberTask> UmsMemberTaskList = umsMemberTaskService.getUmsMemberTaskList(record);
        return CommonResult.success(CommonPage.restPage(UmsMemberTaskList));
    }

    /**
     * <p>保存。</p>
     */
    @ApiOperation(value = "新增一条会员任务表数据", notes = "新增一条会员任务表数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsMemberTask record) {

        int count = umsMemberTaskService.createUmsMemberTask(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条会员任务表数据", notes = "更新一条会员任务表数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updateUmsMemberTask(@RequestBody UmsMemberTask record) {

        int count = umsMemberTaskService.updateUmsMemberTask(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>删除。</p>
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除一条会员任务表数据", notes = "根据Id一条会员任务表数据")
    public CommonResult deleteUmsMemberTask(@PathVariable("id") Long id) {

        int count = umsMemberTaskService.delete(id);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
