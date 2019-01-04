package cn.itcast.test;

import cn.itcast.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao dao = ac.getBean(UserDao.class);
        System.out.println(dao.findAll());


    }
}
