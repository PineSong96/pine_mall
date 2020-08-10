package com.mall.auth.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @vlog: MY code, I understand
 * @desc:
 * @author: pine
 * @createDate: 2020/8/10
 * @version: 1.0
 */
//@Data
//@ConfigurationProperties(value = "pine.jwt")
public class JwtProperties {
    /**
     * 证书名称
     */
    private String keyPairName;

    /**
     * 证书别名
     */
    private String keyPairAlias;

    /**
     * 证书私钥
     */
    private String keyPairSecret;

    /**
     * 证书存储密钥
     */
    private String keyPairStoreSecret;

    public static void main(String[] args) {
        int n = 10 +25+ 30 +25+ 20 +20 +15;
        System.out.println(n);
    }
}
