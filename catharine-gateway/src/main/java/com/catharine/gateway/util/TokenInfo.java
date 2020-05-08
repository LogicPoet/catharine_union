package com.catharine.gateway.util;

import lombok.Data;

/**
 * @author LZ
 * @date 2020/4/9 17:13
 **/
@Data
public class TokenInfo {

    /**
     * 令牌值
     */
    private String token;

    /**
     * 过期秒数
     */
    private int expire;

}