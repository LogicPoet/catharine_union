package com.catharine.auth;

import com.catharine.common.constant.AppConstant;
import com.catharine.common.launch.CatharineApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Liuzhi
 */
@SpringBootApplication
public class AuthApp {

    public static void main(String[] args) {
        CatharineApplication.run(AppConstant.APPLICATION_AUTH_NAME,AuthApp.class, args);
    }

}
