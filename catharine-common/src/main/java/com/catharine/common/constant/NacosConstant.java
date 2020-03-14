package com.catharine.common.constant;

/**
 * <p>Title: NacosConstant</p>
 * <p>description: Nacos常量</p>
 * <p>Company: </p>
 *
 * @author LogicPoet
 * @version V1.0
 * @date 2019/12/27 21:20
 **/
public interface NacosConstant {
    /**
     * nacos 地址
     */
    String NACOS_ADDR = "127.0.0.1:8848";

    /**
     * nacos 配置前缀
     */
    String NACOS_CONFIG_PREFIX = "catharine";

    /**
     * nacos 组配置后缀
     */
    String NACOS_GROUP_SUFFIX = "-group";

    /**
     * nacos 配置文件类型
     */
    String NACOS_CONFIG_FORMAT = "yaml";
}
