package cn.xiaofeng.jdbcTemplateDemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{
    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;
}