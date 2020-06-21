package com.zjc.bokecms.controller;

import com.zjc.bokecms.entity.Book;
import com.zjc.bokecms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: bokecms
 * @description: 这是一个bookController
 * @author: zjc
 * @create: 2020-06-13 15:03
 **/
@Controller
@RequestMapping("/api/book")
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping(value="/add",method = RequestMethod.POST)
    @ResponseBody
    public String addBooks(@RequestBody Book book) {
        String msg="";
        int flag=bookService.addBook(book);
        if (flag>0)
        {
            msg="success";
        }else{
            msg="fail";
        }
        return msg;
    }

    @RequestMapping(value="/update",method = RequestMethod.PUT)
    @ResponseBody
    public int update(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @RequestMapping(value="/getBookById",method = RequestMethod.GET)
    @ResponseBody
    public Book getBookById(@RequestParam Integer id){
        System.out.println(id);
        return bookService.getBookById(id);
    }
    @RequestMapping(value="/getBooksAll",method = RequestMethod.GET)
    @ResponseBody
    public List<Book>  getBooksAll(){
        return bookService.getAllBooks();
    }
    @RequestMapping(value="/deleteBookById",method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteBookById(@RequestParam Integer id){
        return bookService.deleteBookById(id);
    }
}
