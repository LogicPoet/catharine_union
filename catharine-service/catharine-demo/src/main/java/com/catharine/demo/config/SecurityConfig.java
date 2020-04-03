package com.catharine.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LZ
 * @date 2020/4/1 13:28
 **/
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 设置密码编码器
     *
     * @return BCrypt算法
     */
    @Bean
    public PasswordEncoder initPasswordEncoder(){
//        return new BCryptPasswordEncoder();
        return NoOpPasswordEncoder.getInstance();
    }

    /**
     * 重写，拦截机制
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
//                .antMatchers("/r/r1").hasAuthority("p2")
//                .antMatchers("/r/r2").hasAuthority("p2")
                //所有/r/**的请求必须认证通过
                .antMatchers("/r/**").authenticated()
                //除了/r/**，其它的请求可以访问
                .anyRequest().permitAll()

                .and()
                //允许表单登录
                .formLogin()
                //登录页面
//                .loginPage("/login-view")
//                .loginProcessingUrl("/login")
                //自定义登录成功的页面地址
                .successForwardUrl("/login-success")

//                .and()
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
//
//                .and()
//                .logout()
//                .logoutUrl("/logout")
//                .logoutSuccessUrl("/login-view?logout")
        ;


    }

    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<>();
        l.add("1");
    }

}
