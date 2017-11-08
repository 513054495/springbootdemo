package com.ray.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorld控制类
 * @author Ray Lin
 * @createTime 2017-11-08 0:04
 */
@RestController
@RequestMapping
public class HelloWorldController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String say(){
        return "Hello World";
    }

    @RequestMapping(value = "/1",method = RequestMethod.GET)
    public String error() throws Exception {
        throw new Exception("制造故意出错");
    }

}
