package com.leadtecture.feignsample.barservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoweiwei 2018/8/23.
 */
@RestController
public class BarController {

    @GetMapping("/hello")
    public String hello() {

        return "bar";
    }
}
