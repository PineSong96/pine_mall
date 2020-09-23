package com.pine.mall.product.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @vlog: My code, I understand
 * @desc:
 * @author: pine
 * @createDate: 2020/8/11
 * @version: 1.0
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.mall.core.pms.dao"})
public class MyBatisConfig {
}
