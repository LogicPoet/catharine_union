package com.catharine.auth.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LZ
 * @date 2020/4/3 10:07
 **/
@Configuration
@MapperScan("com.catharine.**.mapper.**")
public class MybatisPlusConfiguration {

    @Bean
    @ConditionalOnMissingBean(PaginationInterceptor.class)
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    ///**
    // * sql 日志
    // *
    // * @return SqlLogInterceptor
    // */
    //@Bean
    //@ConditionalOnProperty(value = "blade.mybatis-plus.sql-log.enable", matchIfMissing = true)
    //public SqlLogInterceptor sqlLogInterceptor() {
    //    return new SqlLogInterceptor();
    //}

}