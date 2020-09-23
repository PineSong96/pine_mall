package com.pine.mall.member.token;

import com.pine.mall.member.constant.MDA;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * @vlog: My code, I understand
 * @desc: token请求方法封装
 * @author: pine
 * @createDate: 2020/8/20
 * @version: 1.0
 */
@Slf4j
public class TokenRequestUtil {
    /**
     * 方法实现说明:封装用户到认证中心的请求头 和请求参数
     * @author:smlz
     * @param userName 用户名
     * @param password 密码
     * @return:
     * @exception:
     * @date:2020/1/22 15:32
     */
    public static HttpEntity<MultiValueMap<String, String>> wrapOauthTokenRequest(String userName, String password) {
        //封装oauth2 请求头 clientId clientSecret
        HttpHeaders httpHeaders = wrapHttpHeaders();
        //封装请求参数
        MultiValueMap<String, String> reqParams = new LinkedMultiValueMap<>();
        reqParams.add(MDA.USER_NAME,userName);
        reqParams.add(MDA.PASS,password);
        reqParams.add(MDA.GRANT_TYPE,MDA.PASS);
        reqParams.add(MDA.SCOPE,MDA.SCOPE_AUTH);
        //封装请求参数
        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(reqParams, httpHeaders);
        return entity;
    }

    /**
     * 方法实现说明:封装刷新token的请求
     * @author:smlz
     * @param refreshToken:刷新token
     * @return: HttpEntity
     * @exception:
     * @date:2020/1/22 16:14
     */
    public static HttpEntity<MultiValueMap<String, String>> wrapRefreshTokenRequest(String refreshToken) {

        HttpHeaders httpHeaders = wrapHttpHeaders();

        MultiValueMap<String,String> param = new LinkedMultiValueMap<>();
        param.add("grant_type","refresh_token");
        param.add("refresh_token",refreshToken);

        HttpEntity<MultiValueMap<String,String>> httpEntity = new HttpEntity<>(param,httpHeaders);

        return httpEntity;
    }

    /**
     * 方法实现说明:封装请求头
     * @author:smlz
     * @return:HttpHeaders
     * @exception:
     * @date:2020/1/22 16:10
     */
    public static HttpHeaders wrapHttpHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        httpHeaders.setBasicAuth(MDA.CLIENT_ID,MDA.CLIENT_SECRET);
        return httpHeaders;
    }


}
