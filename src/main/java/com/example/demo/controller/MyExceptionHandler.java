package com.example.demo.controller;

import com.example.demo.exception.AppException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 方式1
 * 自定义异常处理&返回定制json数据；
 */
//@RestControllerAdvice
//public class MyExceptionHandler {
//
//
//    @ExceptionHandler(AppException.class)
//    public Map<String,String> handleException(){
//        Map<String,String> res = new HashMap<>();
//        res.put("mes","自定义结果");
//        res.put("date",new Date().toString());
//        return res;
//    }
//
//}



