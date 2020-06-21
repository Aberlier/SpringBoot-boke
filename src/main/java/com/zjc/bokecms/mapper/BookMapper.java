package com.zjc.bokecms.mapper;


import com.zjc.bokecms.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.util.List;

/**
 * @program: bokecms
 * @description: Book接口
 * @author: zjc
 * @create: 2020-06-10 20:45
 **/

public interface BookMapper {
    int addBook(Book book);

    int deleteBookById(Integer id);

    int updateBookById(Book book);

    Book getBookById(Integer id);

    List<Book> getAllBooks();

}
