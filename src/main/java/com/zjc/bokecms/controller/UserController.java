package com.zjc.bokecms.controller;

import com.zjc.bokecms.entity.Book;
import com.zjc.bokecms.service.BookService;
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
    BookService bookService;

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        return "index";
    }

    @GetMapping("/getUserById")
    @ResponseBody
    //测试地址为：https://localhost:8081/boke/getUserById?id=1
    public Book getUserById(Integer id){
        return bookService.getBookById(id);
    }

    @GetMapping("/deleteUserById")
    @ResponseBody
    public void deleteUserById(Integer id){
        bookService.deleteBookById(id);
    }

}
