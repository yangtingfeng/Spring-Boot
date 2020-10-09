package com.example.demo;

import com.example.demo.domain.UserBean;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        UserBean userBean = userService.loginIn("ytf");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

    public void  Test(){
        System.out.println("yangtingfeng");
    }

}
