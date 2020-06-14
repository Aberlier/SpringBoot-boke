package com.zjc.bokecms.controller;

import com.zjc.bokecms.entity.Book;
import com.zjc.bokecms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: bokecms
 * @description: 这是一个bookController
 * @author: zjc
 * @create: 2020-06-13 15:03
 **/
@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/bookOps")
    public void bookOps() {
        Book book = new Book();
        book.setName("java开发程序设计");
        book.setAuthor("no");
        int i = bookService.addBook(book);
        System.out.println("addbook---" + i);
        Book book2 = new Book();
        book2.setName("其他书籍");
        book2.setAuthor("yes");
        int updateBook = bookService.updateBook(book2);
        System.out.println("updateBook-------" + updateBook);
        Book selectById = bookService.getBookById(16);
        System.out.println("selectById-------" + selectById);
        int deleteBook = bookService.deleteBookById(15);
        System.out.println("deleteById-----" + deleteBook);
        List<Book> getAllBooks = bookService.getAllBooks();
        System.out.println("getAllBooks----" + getAllBooks);
    }
}
