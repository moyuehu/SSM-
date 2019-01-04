package cn.itcast.controller;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/findAll")
    public String findAll(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService dao = ac.getBean(UserService.class);
        List<User> list = dao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
        return "success";

    }
}
