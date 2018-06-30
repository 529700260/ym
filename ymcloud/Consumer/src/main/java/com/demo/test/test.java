package com.demo.test;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/6/28 0028.
 */
@FeignClient(name= "service0",fallback = TestHystrix.class)
public interface test {
    @RequestMapping(value = "/service0")
    public String hello();
}
