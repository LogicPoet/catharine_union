package com.catharine.user.controller;

import com.catharine.common.model.CatUser;
import com.catharine.common.support.R;
import com.netflix.client.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @author LZ
 * @date 2020/4/9 14:42
 **/
@RestController
public class DemoController {

    @GetMapping("ceshi")
    public R test(CatUser catUser, HttpRequest httpRequest, HttpServletRequest servletRequest, String username){
        Enumeration<String> catUser1 = servletRequest.getHeaders("catUser");
        String username1 = servletRequest.getHeader("username");
        System.out.println(username1);
        System.out.println(catUser);
        System.out.println(username);
        return R.data("执行");
    }
}
