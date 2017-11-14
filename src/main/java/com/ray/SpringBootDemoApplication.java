package com.ray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * SpringBootDemo启动类
 * @author Ray Lin
 * @createTime 2017-11-07 23:55
 */
@SpringBootApplication
@EnableScheduling
public class SpringBootDemoApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringBootDemoApplication.class,args);
    }
}
