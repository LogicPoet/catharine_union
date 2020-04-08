package com.catharine.gateway;

import com.catharine.common.constant.AppConstant;
import com.catharine.common.launch.CatharineApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author liuzhi
 */
@EnableScheduling
//@SpringCloudApplication()
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class GatewayApp {

    public static void main(String[] args) {
        CatharineApplication.run(AppConstant.APPLICATION_GATEWAY_NAME,GatewayApp.class, args);
    }

}
