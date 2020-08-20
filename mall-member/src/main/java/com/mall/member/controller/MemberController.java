package com.mall.member.controller;

import com.mall.common.api.CommonResult;
import com.mall.common.api.TokenInfo;
import com.mall.common.exception.BusinessException;
import com.mall.core.ums.entity.UmsMember;
import com.mall.member.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @vlog: My code, I understand
 * @desc: 会员账号管理
 * @author: pine
 * @createDate: 2020/8/20
 * @version: 1.0
 */
@RestController
@RequestMapping("/sso")
@Api(tags = "LoginController", description = "会员登录注册管理")
public class MemberController {
    @Autowired
    private UmsMemberService memberService;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation("会员登录")
    @PostMapping(value = "/login")
    @ResponseBody
    public CommonResult login(@RequestParam String username,
                              @RequestParam String password) {
        TokenInfo tokenInfo = memberService.login(username, password);
        if (tokenInfo == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", tokenInfo.getAccess_token());
        tokenMap.put("tokenHead", tokenHead);
        tokenMap.put("refreshToken", tokenInfo.getRefresh_token());
        return CommonResult.success(tokenMap);
    }

    @ApiOperation("会员注册")
    @PostMapping(value = "/register")
    @ResponseBody
    public CommonResult register(@RequestParam String username,
                                 @RequestParam String password,
                                 @RequestParam String telephone,
                                 @RequestParam String authCode) {
        return memberService.register(username, password, telephone, authCode);
    }
    @ApiOperation("获取验证码")
    @PostMapping(value = "/getAuthCode")
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam String telephone) throws BusinessException {
        return memberService.generateAuthCode(telephone);
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条会员表数据", notes = "更新一条会员表数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updateUmsMember(@RequestBody UmsMember record) {

        int count = memberService.updateUmsMember(record);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
