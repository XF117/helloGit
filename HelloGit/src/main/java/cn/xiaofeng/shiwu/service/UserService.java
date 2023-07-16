package cn.xiaofeng.shiwu.service;

import cn.xiaofeng.shiwu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public void accountMoney(){

        //try{
            //开启事务


            //处理业务
            userDao.reduceMoney();

            int i = 10/0;

            userDao.addMoney();

            //没有异常提交事务

        //}catch (Exception e){
            //出现异常，事务回滚

        //}

    }

}
