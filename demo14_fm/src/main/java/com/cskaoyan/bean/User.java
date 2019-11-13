package com.cskaoyan.bean;

import lombok.Data;

@Data
public class User {

    String username;
    String password;
    int age;

    public User(String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }
}
