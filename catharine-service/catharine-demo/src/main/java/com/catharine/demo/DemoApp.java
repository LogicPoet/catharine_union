package com.catharine.demo;

import com.catharine.common.constant.AppConstant;
import com.catharine.common.launch.CatharineApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>Title: UserApp</p>
 * <p>description: </p>
 * <p>Company: </p>
 *
 * @author LZ
 * @date 2020/3/14 16:34
 **/
@SpringBootApplication
public class DemoApp {

    public static void main(String[] args) {
        CatharineApplication.run(AppConstant.APPLICATION_DEMO_NAME,DemoApp.class,args);
    }

}
