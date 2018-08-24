package com.leadtecture.feignsample.barservice;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shayne.gao 2018/8/24.
 */
public interface BarContract {
    @GetMapping("/hello")
    String hello();
}