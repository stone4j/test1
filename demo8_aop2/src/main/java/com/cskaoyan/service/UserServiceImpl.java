package com.cskaoyan.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void register(String username, String password) {
        System.out.println("username: " + username);
        System.out.println("password: " + password);
    }
}
