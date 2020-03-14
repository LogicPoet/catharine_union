package com.catharine.user.controller;

import com.catharine.common.support.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: UserController</p>
 * <p>description: </p>
 * <p>Company: </p>
 *
 * @author LZ
 * @date 2020/3/14 17:19
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/test")
    public R test(){
        return R.data("测试项目启动");
    }

}
