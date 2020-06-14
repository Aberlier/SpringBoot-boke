package com.zjc.bokecms.service;

import com.zjc.bokecms.entity.Book;
import com.zjc.bokecms.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: bokecms
 * @description: userService
 * @author: zjc
 * @create: 2020-06-09 19:30
 **/
@Service
public class BookService {
    @Resource
    BookMapper bookMapper;

    public int addBook(Book book){
        System.out.println("book---"+book);
        return bookMapper.addBook(book);
    }
    public int updateBook(Book book){
        return bookMapper.updateBookById(book);
    }
    public Book getBookById(int id){
        return bookMapper.getBookById();
    }
    public int deleteBookById(int id){
        return bookMapper.deleteBookById(id);
    }
    public List<Book> getAllBooks(){
        return bookMapper.getAllBooks();
    }
}
