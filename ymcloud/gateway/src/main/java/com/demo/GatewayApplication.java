package com.demo;

import com.demo.Filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by Administrator on 2018/6/27 0027.
 * 网关中心
 *
 * zuul:
 routes:
 service0:
 path: /service0/
 serviceId: service0
 service2:
 path: /service2/
 serviceId: service2
 baidu:
 path: /baidu
 url: http://www.baidu.com
 *
 */

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient     //把转发服务放到注册中心  默认把所有服务加上路由了 无需自己手动配置
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }
}
