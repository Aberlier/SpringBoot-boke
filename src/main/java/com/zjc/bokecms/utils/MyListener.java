package com.zjc.bokecms.utils;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @program: bokecms
 * @description: 监听器
 * @author: zjc
 * @create: 2020-06-09 18:51
 **/
@WebListener
public class MyListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("监听器销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("监听器初始化");
    }
}
