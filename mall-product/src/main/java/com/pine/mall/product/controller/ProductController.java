package com.pine.mall.product.controller;

import com.pine.common.api.CommonPage;
import com.pine.common.api.CommonResult;
import com.pine.mall.core.pms.entity.PmsProduct;
import com.pine.mall.product.service.PmsProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @vlog: My code, I understand
 * @desc: 商品查询
 * @author: pine
 * @createDate: 2020/9/23
 * @version: 1.0
 */

@RestController
public class ProductController {

    @Autowired
    private PmsProductService productService;

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取商品信息数据", notes = "根据id来获取商品信息详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getPmsProduct(@PathVariable("id") Long id) {
        PmsProduct data = productService.getPmsProductById(id);
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
        List<PmsProduct> PmsProductList = productService.getPmsProductByPage(record, pageSize, pageNum);

        return CommonResult.success(CommonPage.restPage(PmsProductList));
    }

}
