package com.catharine.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author LZ
 * @date 2020/4/2 10:50
 **/
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = false,securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    //安全拦截机制（最重要）
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                //.antMatchers("/r/r1").hasAuthority("p2")
                //.antMatchers("/r/r2").hasAuthority("p2")
                .antMatchers("/user/**").permitAll()//所有/r/**的请求必须认证通过
                .anyRequest().authenticated()//除了/r/**，其它的请求可以访问
        ;


    }
}