package com.cskaoyan.controller;

import com.cskaoyan.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class HelloController {

    @RequestMapping("hello/abc")
    public String hello(){
        return "/hello.jsp";
    }
    @RequestMapping("hello")
    public String helloexception() throws Exception {
        if (true)throw new Exception("hello");
        return "/hello.jsp";
    }
    @RequestMapping(value = "submit",method = RequestMethod.GET)
    public String submit(String username, String password, Date birthday){
        System.out.println(username);
        System.out.println(password);
        return "/hello.jsp";
    }

    @RequestMapping(value = "submit",method = RequestMethod.POST)
    public User submit2(@RequestBody User user){
        return user;
    }
}
