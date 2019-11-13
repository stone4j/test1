package com.cskaoyan.mytest;

import com.cskaoyan.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class AopTest {

    @Resource(name = "userServiceProxy")
    UserService userService;

    @Test
    public void mytest(){
        userService.register("songge","zhenshuai");
    }
}
