package com.example.springboottest;

import com.example.springboottest.dao.UserDao;
import com.example.springboottest.pojo.User;
import com.example.springboottest.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringboottestApplicationTests {
//这种错误是由于数据库的字段为datetime，
// 但是数据的值为0000-00-00 00:00:00，这时zeroDateTimeBehavior
// 默认为exception，会抛出一个SQLException异常
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        for (User user : userService.finAll()) {
            System.out.println(user.toString());
        }

    }

}
