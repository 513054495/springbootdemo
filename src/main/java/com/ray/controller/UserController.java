package com.ray.controller;

import com.ray.entity.Result;
import com.ray.entity.User;
import com.ray.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制类
 * @author Ray Lin
 * @createTime 2017-11-13 23:28
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger= LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result save(@RequestBody User user){
        userService.save(user);
        logger.info("<<==[resource:{}],[arg:{}][MESSAGE:{}]==>> ", "/user/add",user.toString(),"保存成功");
        return new Result(1,"保存成功",null);
    }
}
