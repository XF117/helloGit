package cn.xiaofeng.jdbcTemplateDemo.service;

import cn.xiaofeng.jdbcTemplateDemo.dao.BookDao;
import cn.xiaofeng.jdbcTemplateDemo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao;

    public void addBook(Book book){
        bookDao.add(book);
    }

    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    public void deleteBook(String id){
        bookDao.deleteBook(id);
    }

    public int findCount(){
       return bookDao.selectCount();
    }

    public Book findOne(String id){
       return bookDao.findInfo(id);
    }

    public List<Book> findAll(){
        return bookDao.findAllInfo();
    }
}
