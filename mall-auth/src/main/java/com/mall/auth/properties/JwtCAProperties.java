package com.mall.auth.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @vlog: MY code, I understand
 * @desc:
 * @author: pine
 * @createDate: 2020/8/10
 * @version: 1.0
 */
@Data
@ConfigurationProperties(value = "pine.jwt")
public class JwtCAProperties {
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
}
