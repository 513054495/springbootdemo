package com.ray.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * HelloWorld控制类
 * @author Ray Lin
 * @createTime 2017-11-08 0:04
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    public String say(Map<String,Object> map){
        map.put("hello","HelloWorld");
        return "/hello";
    }

    @RequestMapping(value = "/1",method = RequestMethod.GET)
    public String error() throws Exception {
        throw new Exception("制造故意出错");
    }

}
