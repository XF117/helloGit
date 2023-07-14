package cn.xiaofeng.jdbcTemplateDemo;

import cn.xiaofeng.jdbcTemplateDemo.entity.Book;
import cn.xiaofeng.jdbcTemplateDemo.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestBook {
    ApplicationContext context =
            new ClassPathXmlApplicationContext("bean1.xml");
    BookService bookService = context.getBean("bookService", BookService.class);

    Book book = new Book();

    @Test
    public void testAdd(){
        book.setUserId("1");
        book.setUsername("java");
        book.setUstatus("a");
        bookService.addBook(book);
    }

    @Test
    public void testUpdate(){
        book.setUserId("1");
        book.setUsername("java11");
        book.setUstatus("a11");
        bookService.updateBook(book);
    }

    @Test
    public void testDelete(){
        bookService.deleteBook("1");
    }

    @Test
    public void testFindCount(){
        int count = bookService.findCount();
        System.out.println(count);
    }

    @Test
    public void testFindInfo(){
        Book book1 = bookService.findOne("2");
        System.out.println(book1);
    }

    @Test
    public void testFindAllInfo(){
        List<Book> all = bookService.findAll();
        System.out.println(all);
    }

}
