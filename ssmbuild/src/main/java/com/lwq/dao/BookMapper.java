package com.lwq.dao;

import com.lwq.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Primary;

import java.util.List;

/**
 * @author lwq
 * @date 2020/4/20 -17:05
 */
public interface BookMapper {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById( int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询所有的书
    List<Books> queryAllBook();

    //搜索功能
    Books queryBookByName(@Param("bookName")String bookName);
}
