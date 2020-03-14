package com.catharine.common.support;

import java.io.Serializable;

/**
 * <p>Title: IResultCode</p>
 * <p>description: 业务代码接口</p>
 * <p>Company: </p>
 *
 * @author LogicPoet
 * @version V1.0
 * @date 2020/1/1 21:54
 **/
public interface IResultCode extends Serializable {

    /**
     * 消息
     *
     * @return String
     */
    String getMessage();

    /**
     * 状态码
     *
     * @return int
     */
    int getCode();

}
