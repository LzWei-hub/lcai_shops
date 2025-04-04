package com.lcai.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @auther LzWei
 * @description MyBatis相关配置
 * @date 2025/4/3
 * @github https://github.com/LzWei-hub
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.lcai.mbg.mapper","com.lcai.dao"})
public class MyBatisConfig {
}
