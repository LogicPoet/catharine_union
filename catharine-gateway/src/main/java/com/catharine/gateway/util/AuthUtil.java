package com.catharine.gateway.util;

import com.catharine.common.model.CatUser;

/**
 * @author LZ
 * @date 2020/4/9 9:43
 **/
public class AuthUtil {

    /**
     * 获取登陆用户对象
     *
     * @param accessToken token令牌
     * @return
     */
    public static CatUser getCatUser(String accessToken) {
        return new CatUser();
    }
}
