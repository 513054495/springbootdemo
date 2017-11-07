package com.ray.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorld控制类
 * @author Ray Lin
 * @createTime 2017-11-08 0:04
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String say(){
        return "Hello World";
    }
}
