package com.zjc.bokeCMS.controller;

import org.springframework.stereotype.Controller;
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

    @ResponseBody
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello Word!";
    }
}
