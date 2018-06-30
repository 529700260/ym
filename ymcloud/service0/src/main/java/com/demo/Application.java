package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/27 0027.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Application {
    @GetMapping("/service0")
    public String service(){
        return "service0";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
