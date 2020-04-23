package com.lwq.service;

import com.lwq.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lwq
 * @date 2020/4/20 -18:04
 */
public interface BookService {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询所有的书
    List<Books> queryAllBook();

    //搜索功能
    Books queryBookByName(@Param("bookName") String bookName);
}
