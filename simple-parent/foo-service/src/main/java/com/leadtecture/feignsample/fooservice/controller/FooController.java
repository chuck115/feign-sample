package com.leadtecture.feignsample.fooservice.controller;

import com.leadtecture.feignsample.fooservice.feign.BarClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoweiwei 2018/8/23.
 */
@RestController
public class FooController {

    @Autowired
    private BarClient barClient;

    @GetMapping("/hello")
    public String hello() {

        String res = barClient.Hello();

        return "foo" + res;
    }

}
