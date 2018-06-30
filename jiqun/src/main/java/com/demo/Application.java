package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Administrator on 2018/6/27 0027.
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
/**
 spring.application.name=spring-cloud-eureka

 server.port=8000
 eureka.client.register-with-eureka=false
 eureka.client.fetch-registry=false

 eureka.client.serviceUrl.defaultZone=http://localhost:${server.port}/eureka/
 **/