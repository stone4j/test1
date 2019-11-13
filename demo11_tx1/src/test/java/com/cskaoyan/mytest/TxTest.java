package com.cskaoyan.mytest;

import com.cskaoyan.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class TxTest {
    @Autowired
            @Qualifier("accountServiceProxy")
    AccountService accountService;
    @Test
    public void mytest(){
        accountService.transfer(1,2,100);
    }
}
