package com.catharine.common.launch;

import com.catharine.common.constant.LauncherConstant;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Properties;

/**
 * <p>Title: LauncherServiceImpl</p>
 * <p>description: 启动参数拓展</p>
 * <p>Company: </p>
 *
 * @author LogicPoet
 * @version V1.0
 * @date 2019/12/27 21:07
 **/
public class LauncherServiceImpl implements LauncherService {

    /**
     * 启动时 处理 SpringApplicationBuilder
     *
     * @param builder SpringApplicationBuilder
     * @param appName SpringApplicationAppName
     * @param profile SpringApplicationProfile
     */
    @Override
    public void launcher(SpringApplicationBuilder builder, String appName, String profile) {
        Properties props = System.getProperties();
        props.setProperty("spring.cloud.nacos.discovery.server-addr", LauncherConstant.nacosAddr(profile));
        props.setProperty("spring.cloud.nacos.config.server-addr", LauncherConstant.nacosAddr(profile));
        //props.setProperty("spring.cloud.sentinel.transport.dashboard", LauncherConstant.sentinelAddr(profile));
        //props.setProperty("spring.zipkin.base-url", LauncherConstant.zipkinAddr(profile));
    }
}
