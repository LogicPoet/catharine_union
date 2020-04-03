package com.catharine.user.feign;

import com.catharine.common.constant.AppConstant;
import com.catharine.common.support.R;
import com.catharine.user.dto.UserInfoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author LZ
 * @date 2020/4/3 16:23
 **/
@FeignClient(
        value = "catharine-user",
        fallback = IUserClientFallback.class
)
public interface IUserClient {

    String API_PREFIX = "/user";

    /**
     * 获取用户信息
     *
     * @param userId 用户id
     * @return
     */
    @GetMapping(API_PREFIX + "/user-info-by-id")
    R<UserInfoDTO> userInfo(@RequestParam("userId") Long userId);

    /**
     * 获取用户信息
     *
     * @param account 账号名
     * @return
     */
    @GetMapping(API_PREFIX + "/user-info-by-account")
    R<UserInfoDTO> userInfo(@RequestParam("account") String account);

    /**
     * 获取用户信息
     *
     * @param account    账号
     * @param password   密码
     * @return
     */
    @GetMapping(API_PREFIX + "/user-info")
    R<UserInfoDTO> userInfo(@RequestParam("account") String account, @RequestParam("password") String password);

}
