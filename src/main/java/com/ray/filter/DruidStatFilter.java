package com.ray.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Druid过滤器
 * @author Ray Lin
 * @createTime 2017-11-15 23:22
 */
@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
        initParams={
                //忽略资源
                @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
        }
)
public class DruidStatFilter extends WebStatFilter {

}
