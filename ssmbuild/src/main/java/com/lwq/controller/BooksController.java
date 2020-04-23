package com.lwq.controller;

import com.lwq.pojo.Books;
import com.lwq.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwq
 * @date 2020/4/20 -20:31
 */
@Controller
@RequestMapping("/book")
public class BooksController {
    //controller层调用 service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部的书籍，并且返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String queryAllTest(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    //跳转到增加数据页面
    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    //  添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books) {
        System.out.println("addboox:::" + books);
        bookService.addBook(books);
        //重定向到我们 @RequestMapping("/toAddBook")请求
        return "redirect:/book/allBook";
    }

    //跳转到修改数据页面
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id, Model model) {
        //修改的时候携带原来书的数据
        Books books = bookService.queryBookById(id);
        //带给前端
        model.addAttribute("QBook", books);
        return "updateBook";
    }

    //    修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        System.out.println("updateBook=>" + books);
        bookService.updateBook(books);
        //重定向到我们 @RequestMapping("/toAddBook")请求
        return "redirect:/book/allBook";
    }

    //    删除书籍
    @RequestMapping("/deleteBook/{bookId}")
    public String updateBook(@PathVariable("bookId") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //    查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName, Model model) {
        Books books = bookService.queryBookByName(queryBookName);

        List<Books> list = new ArrayList<Books>();
        list.add(books);

        //        查询优化
        if(books==null){
            list=bookService.queryAllBook();
            model.addAttribute("error","未查到");
        }

        model.addAttribute("list", list);
        return "allBook";
    }

}
