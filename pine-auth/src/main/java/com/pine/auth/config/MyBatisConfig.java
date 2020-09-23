package com.pine.auth.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @vlog: My code, I understand
 * @desc: 注入mapper
 *
 * @author: pine
 * @createDate: 2020/8/12
 * @version: 1.0
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.pine.mall.core.ums.dao")
public class MyBatisConfig {
}
