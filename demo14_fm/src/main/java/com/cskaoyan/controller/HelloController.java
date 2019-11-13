package com.cskaoyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello(Model model){
        model.addAttribute("content","freemarker");

        return "WEB-INF/ftl/hello";
    }
}
