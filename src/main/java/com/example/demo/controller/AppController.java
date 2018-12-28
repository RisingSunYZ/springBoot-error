package com.example.demo.controller;


import com.example.demo.exception.AppException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/test")
    public void test(Model model) throws AppException{
        model.addAttribute("name","杨钊");
        throw new AppException();
    }
}
