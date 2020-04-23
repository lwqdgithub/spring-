import com.lwq.pojo.Books;
import com.lwq.service.BookService;
import com.lwq.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

/**
 * @author lwq
 * @date 2020/4/20 -20:57
 */
public class MyTest {
    @Test
    public  void  test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       BookService impl = (BookService) context.getBean("BookServiceImpl");
       for(Books books:impl.queryAllBook()){
           System.out.println(books);
       }
    }
}
