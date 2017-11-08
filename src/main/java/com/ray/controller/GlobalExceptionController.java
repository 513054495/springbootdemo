package com.ray.controller;

import com.ray.entity.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常控制类
 * @author Ray Lin
 * @createTime 2017-11-08 22:38
 */
@ControllerAdvice
public class GlobalExceptionController {

    private static final Logger logger= LoggerFactory.getLogger(GlobalExceptionController.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result defaultErrorHandler(HttpServletRequest req, Exception e)  {
        logger.error("<<==[resource:{}],[MESSAGE:{}]==>> ", req.getRequestURL(), e.getMessage());
        return new Result(-1,e.getMessage(),null);
    }
}
