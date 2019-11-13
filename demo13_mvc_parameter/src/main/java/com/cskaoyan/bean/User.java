package com.cskaoyan.bean;

import lombok.Data;

@Data
public class User {
    String username;
    String password;
    Boolean married;
    UserDetail userDetail;
}
