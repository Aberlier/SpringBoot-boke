package com.zjc.bokecms.service;

import org.springframework.stereotype.Service;

/**
 * @program: bokecms
 * @description: userService
 * @author: zjc
 * @create: 2020-06-09 19:30
 **/
@Service
public class UserService {
    public String getUserById(Integer id){
        System.out.println("get....");
        return "user";
    }
    public void deleteUserById(Integer id){
        System.out.println("delete...");
    }
}
