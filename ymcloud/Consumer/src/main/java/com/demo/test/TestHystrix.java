package com.demo.test;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/6/28 0028.
 */
@Component
public class TestHystrix implements test {
    @Override
      public String hello(){
        return "hello this messge send failed ";
    }
}
