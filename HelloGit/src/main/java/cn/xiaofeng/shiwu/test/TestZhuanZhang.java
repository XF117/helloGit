package cn.xiaofeng.shiwu.test;

import cn.xiaofeng.shiwu.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

public class TestZhuanZhang {

    //PlatformTransactionManager

    @Test
    public void testZhuan(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);

        userService.accountMoney();
    }
}
