package com.catharine.user;

import com.catharine.common.constant.AppConstant;
import com.catharine.common.launch.CatharineApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * <p>Title: UserApp</p>
 * <p>description: </p>
 * <p>Company: </p>
 *
 * @author LZ
 * @date 2020/3/14 16:34
 **/
@SpringBootApplication
public class UserApp {
    public static void main(String[] args) {
        CatharineApplication.run(AppConstant.APPLICATION_USER_NAME,UserApp.class,args);
    }
}
