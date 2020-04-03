package com.catharine.auth;

import com.catharine.common.constant.AppConstant;
import com.catharine.common.launch.CatharineApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Liuzhi
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "com.catharine.user.feign")
@ComponentScan(basePackages = {"com.catharine.auth","com.catharine.user.feign"})
public class AuthApp {

    public static void main(String[] args) {
        CatharineApplication.run(AppConstant.APPLICATION_AUTH_NAME,AuthApp.class, args);
    }

}
