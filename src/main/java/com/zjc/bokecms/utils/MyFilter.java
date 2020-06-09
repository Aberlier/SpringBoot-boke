package com.zjc.bokecms.utils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @program: bokecms
 * @description: 过滤器
 * @author: zjc
 * @create: 2020-06-09 18:50
 **/
@WebFilter("/*")
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行过滤器");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始过滤器");
    }

    @Override
    public void destroy() {
        System.out.println("销毁过滤器");
    }
}
