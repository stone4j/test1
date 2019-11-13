package com.cskaoyan.controller;

import com.cskaoyan.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ParameterController {

    @RequestMapping("parameter/bean/bean")
    public String parameterBeanBean(User user){
        System.out.println(user);
        return "/hello.jsp";
    }
}
