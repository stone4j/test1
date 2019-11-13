package com.cskaoyan.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class JsonExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String exception(Exception e){
        return "exception " + e.getMessage();
    }
}
