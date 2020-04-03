package com.catharine.user.feign;

import com.catharine.common.support.R;
import com.catharine.user.dto.UserInfoDTO;
import org.springframework.stereotype.Component;


/**
 * @author LZ
 * @date 2020/4/3 16:23
 **/
@Component
public class IUserClientFallback implements IUserClient {
    @Override
    public R<UserInfoDTO> userInfo(Long userId) {
        return R.fail("未获取到账号信息");
    }

    @Override
    public R<UserInfoDTO> userInfo(String account) {
        return R.fail("未获取到账号信息");
    }

    @Override
    public R<UserInfoDTO> userInfo(String account, String password) {
        return R.fail("未获取到账号信息");
    }
}
