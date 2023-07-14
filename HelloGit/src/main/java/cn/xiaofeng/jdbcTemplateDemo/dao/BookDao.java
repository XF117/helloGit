package cn.xiaofeng.jdbcTemplateDemo.dao;

import cn.xiaofeng.jdbcTemplateDemo.entity.Book;

import java.util.List;

public interface BookDao {

    void add(Book book);

    void updateBook(Book book);

    void deleteBook(String id);

    int selectCount();

    Book findInfo(String id);

    List<Book> findAllInfo();
}
