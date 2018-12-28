package com.example.demo.controller;

import com.example.demo.exception.AppException;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class MyExceptionControllerHandler {

    @ExceptionHandler({AppException.class})
    public String handleException(HttpServletRequest request,Exception e){
        Map<String,String> res = new HashMap<>();
        res.put("mes","自定义结果");
        res.put("date",new Date().toString());
        res.put("exception",e.toString());
        request.setAttribute("javax.servlet.error.status_code",500);
        request.setAttribute("res",res);
        return "forward:/error";
    }
}
