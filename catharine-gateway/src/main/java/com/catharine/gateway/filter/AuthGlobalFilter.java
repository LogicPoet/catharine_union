package com.catharine.gateway.filter;

import com.alibaba.fastjson.JSONObject;
import com.catharine.common.support.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * <p>Title: AuthGlobalFilter</p>
 * <p>description: </p>
 * <p>Company: </p>
 *
 * @author LZ
 * @date 2020/4/6 20:00
 **/
@Slf4j
@Component
public class AuthGlobalFilter implements GlobalFilter, Ordered {
    /**
     * Process the Web request and (optionally) delegate to the next {@code WebFilter}
     * through the given {@link GatewayFilterChain}.
     *
     * @param exchange the current server exchange
     * @param chain    provides a way to delegate to the next filter
     * @return {@code Mono<Void>} to indicate when request processing is complete
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        HttpHeaders headers = request.getHeaders();
        List<String> list = headers.get("cat-token");
        //携带cat-token参数才鉴定
        if (list != null && !list.isEmpty()){
            String token = list.get(0);
            //解析token内容，得到用户
            //if (null == SecureUtil.getUser()) {
            //    //log.warn("签名认证失败，请求接口：{}，请求IP：{}，请求参数：{}", request.getURI(), WebUtil.getIP(request), JsonUtil.toJson(request.getParameterMap()));
            //    R result = R.fail(ResultCode.UN_AUTHORIZED);
            //    exchange.getResponse().setStatusCode(HttpStatus.OK);
            //    exchange.getResponse().getHeaders().add("Content-Type", "application/json;charset=UTF-8");
            //    return exchange.getResponse().writeWith(Flux.just(this.getBodyBuffer(exchange.getResponse(),result)));
            //}
        }
        log.info("方法已执行");

        return chain.filter(exchange);
    }

    /**
     * 封装返回值
     *
     * @param response
     * @param result
     * @return
     */
    private DataBuffer getBodyBuffer(ServerHttpResponse response, R result) {
        return response.bufferFactory().wrap(JSONObject.toJSONBytes(result));
    }

    /**
     * Get the order value of this object.
     * <p>Higher values are interpreted as lower priority. As a consequence,
     * the object with the lowest value has the highest priority (somewhat
     * analogous to Servlet {@code load-on-startup} values).
     * <p>Same order values will result in arbitrary sort positions for the
     * affected objects.
     *
     * @return the order value
     * @see #HIGHEST_PRECEDENCE
     * @see #LOWEST_PRECEDENCE
     */
    @Override
    public int getOrder() {
        return -1;
    }
}
