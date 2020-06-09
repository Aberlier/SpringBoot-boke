package com.zjc.bokecms.controller;

import com.zjc.bokecms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: bokecms
 * @description: This is a UserController
 * @author: zjc
 * @create: 2020-05-17 08:27
 **/
@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello Word!";
    }

    @GetMapping("/getUserById")
    public String getUserById(Integer id){
        return userService.getUserById(id);
    }

    @GetMapping("/deleteUserById")
    public void deleteUserById(Integer id){
        userService.deleteUserById(id);
    }

}
