package com.pine.mall.admin.controller;


import com.pine.common.api.CommonPage;
import com.pine.common.api.CommonResult;
import com.pine.mall.admin.service.PmsProductService;
import com.pine.mall.core.pms.entity.PmsProduct;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 商品信息
 *
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-09-25 22:27:57
 */
@Api(value = "商品信息接口", tags = {"商品信息接口" })
@RestController
@RequestMapping("ums/PmsProduct")
public class PmsProductController {

    @Autowired
    private PmsProductService pmsProductService;

    /**
     * <p>获取全部记录。</p>
     */
    @ApiOperation(value = "获取所有商品信息数据", notes = "可以根据条件获取")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public CommonResult<List<PmsProduct>> all(PmsProduct record) {
        List<PmsProduct> PmsProductList = pmsProductService.getPmsProductList(record);
        return CommonResult.success(PmsProductList);
    }

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取商品信息数据", notes = "根据id来获取商品信息详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getPmsProduct(@PathVariable("id") Long id) {
        PmsProduct data = pmsProductService.getPmsProductById(id);
        return CommonResult.success(data);
    }

    /**
     * <p>根据条件获取。</p>
     */
    @ApiOperation(value = "获取商品信息数据", notes = "根据条件获取")
    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public CommonResult getOne(PmsProduct record) {

        PmsProduct data = pmsProductService.getPmsProduct(record);

        return CommonResult.success(data);
    }

    /**
     * <p>分页查询。</p>
     */
    @ApiOperation(value = "分页获取商品信息数据", notes = "根据条件获取")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<PmsProduct>> page(PmsProduct record,
                                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<PmsProduct> PmsProductList = pmsProductService.getPmsProductByPage(record,pageSize,pageNum);
        return CommonResult.success(CommonPage.restPage(PmsProductList));
    }

    /**
     * <p>保存。</p>
     */
    @ApiOperation(value = "新增一条商品信息数据", notes = "新增一条商品信息数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody PmsProduct record) {

        int count = pmsProductService.createPmsProduct(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条商品信息数据", notes = "更新一条商品信息数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updatePmsProduct(@RequestBody PmsProduct record) {

        int count = pmsProductService.updatePmsProduct(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>删除。</p>
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除一条商品信息数据", notes = "根据Id一条商品信息数据")
    public CommonResult deletePmsProduct(@PathVariable("id") Long id) {

        int count = pmsProductService.delete(id);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
