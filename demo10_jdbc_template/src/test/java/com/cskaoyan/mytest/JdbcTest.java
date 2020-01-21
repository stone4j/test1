package com.cskaoyan.mytest;

import com.cskaoyan.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class JdbcTest {

    @Autowired
    UserDao userDao;

    @Test
    public void mytest(){
        String s = userDao.selectNameById(1);
        System.out.println(s);
    }
}