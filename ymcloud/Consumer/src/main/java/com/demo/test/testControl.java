package com.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/28 0028.
 */
@RestController
public class testControl {
    @Autowired
    test test;

    @RequestMapping("/hello/{name}")
    public String index() {
        return test.hello();
    }
}
