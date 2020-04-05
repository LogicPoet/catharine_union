package com.catharine.auth;

import com.catharine.common.constant.AppConstant;
import com.catharine.common.launch.CatharineApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

/**
 * @author Liuzhi
 */
@EnableFeignClients(basePackages = "com.catharine.user.feign")
@ComponentScan(basePackages = {"com.catharine.auth","com.catharine.user.feign"})
@SpringCloudApplication
public class AuthApp {

    public static void main(String[] args) {
        CatharineApplication.run(AppConstant.APPLICATION_AUTH_NAME,AuthApp.class, args);
    }

}
