package com.ray.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 自定义Servlet上下文监听器
 * @author Ray Lin
 * @createTime 2017-12-10 23:46
 */
@WebListener
public class MyServletContextListenr implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("启动监听器");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("销毁监听器");
    }
}
