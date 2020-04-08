package com.catharine.user.config;

import feign.Feign;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Title: FeignConfig</p>
 * <p>description: </p>
 * <p>Company: </p>
 *
 * @author LZ
 * @date 2020/4/6 19:39
 **/
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level log(){
        return Logger.Level.FULL;
    }

}
