package com.catharine.common.constant;

/**
 * <p>Title: LauncherConstant</p>
 * <p>description: 通用常量</p>
 * <p>Company: </p>
 *
 * @author LogicPoet
 * @version V1.0
 * @date 2019/12/27 21:25
 **/
public interface LauncherConstant {
    /**
     * nacos namespace id
     */
    String NACOS_DEV_NAMESPACE = "";
    String NACOS_TEST_NAMESPACE = "";
    String NACOS_PROD_NAMESPACE = "";

    /**
     * nacos dev 地址
     */
    String NACOS_DEV_ADDR = "192.168.192.137:8848";

    /**
     * nacos prod 地址
     */
    String NACOS_PROD_ADDR = "127.0.0.1:8848";

    /**
     * nacos test 地址
     */
    String NACOS_TEST_ADDR = "127.0.0.1:8848";

    ///**
    // * sentinel dev 地址
    // */
    //String SENTINEL_DEV_ADDR = "127.0.0.1:8858";
    //
    ///**
    // * sentinel prod 地址
    // */
    //String SENTINEL_PROD_ADDR = "172.30.0.58:8858";
    //
    ///**
    // * sentinel test 地址
    // */
    //String SENTINEL_TEST_ADDR = "172.30.0.58:8858";
    //
    ///**
    // * zipkin dev 地址
    // */
    //String ZIPKIN_DEV_ADDR = "http://127.0.0.1:9411";
    //
    ///**
    // * zipkin prod 地址
    // */
    //String ZIPKIN_PROD_ADDR = "http://172.30.0.58:9411";
    //
    ///**
    // * zipkin test 地址
    // */
    //String ZIPKIN_TEST_ADDR = "http://172.30.0.58:9411";

    /**
     * 动态获取nacos namespace
     *
     * @param profile 环境变量
     * @return addr
     */
    static String nacosNamespace(String profile) {
        switch (profile) {
            case (AppConstant.PROD_CODE):
                return NACOS_PROD_NAMESPACE;
            case (AppConstant.TEST_CODE):
                return NACOS_TEST_NAMESPACE;
            default:
                return NACOS_DEV_NAMESPACE;
        }
    }

    /**
     * 动态获取nacos地址
     *
     * @param profile 环境变量
     * @return addr
     */
    static String nacosAddr(String profile) {
        switch (profile) {
            case (AppConstant.PROD_CODE):
                return NACOS_PROD_ADDR;
            case (AppConstant.TEST_CODE):
                return NACOS_TEST_ADDR;
            default:
                return NACOS_DEV_ADDR;
        }
    }

    ///**
    // * 动态获取sentinel地址
    // *
    // * @param profile 环境变量
    // * @return addr
    // */
    //static String sentinelAddr(String profile) {
    //    switch (profile) {
    //        case (AppConstant.PROD_CODE):
    //            return SENTINEL_PROD_ADDR;
    //        case (AppConstant.TEST_CODE):
    //            return SENTINEL_TEST_ADDR;
    //        default:
    //            return SENTINEL_DEV_ADDR;
    //    }
    //}
    //
    ///**
    // * 动态获取zipkin地址
    // *
    // * @param profile 环境变量
    // * @return addr
    // */
    //static String zipkinAddr(String profile) {
    //    switch (profile) {
    //        case (AppConstant.PROD_CODE):
    //            return ZIPKIN_PROD_ADDR;
    //        case (AppConstant.TEST_CODE):
    //            return ZIPKIN_TEST_ADDR;
    //        default:
    //            return ZIPKIN_DEV_ADDR;
    //    }
    //}
}
