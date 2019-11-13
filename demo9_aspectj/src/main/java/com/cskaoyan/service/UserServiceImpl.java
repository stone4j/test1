package com.cskaoyan.service;

import com.cskaoyan.anno.CountingTime;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    @CountingTime
    public void hello() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello annotation");
    }
}
