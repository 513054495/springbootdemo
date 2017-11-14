package com.ray.config;

/**
 * 定时器配置类
 * @author Ray Lin
 * @createTime 2017-11-14 23:26
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SchedulingConfig {
    private final static Logger logger = LoggerFactory.getLogger(SchedulingConfig.class);
    @Scheduled(cron = "0/5 * * * * ?") // 每5秒执行一次
    public void scheduler() {
        logger.info("<<==[TIME:{}],[MESSAGE:{}]==>> ", System.currentTimeMillis(), "定时器执行");
    }

}
