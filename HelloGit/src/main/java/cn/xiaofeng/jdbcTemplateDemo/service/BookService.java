package cn.xiaofeng.jdbcTemplateDemo.service;

import cn.xiaofeng.jdbcTemplateDemo.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;
}
