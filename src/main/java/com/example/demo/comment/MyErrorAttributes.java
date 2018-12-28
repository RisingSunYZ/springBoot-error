package com.example.demo.comment;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

@Component
public class MyErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
        Map<String, Object> res =  super.getErrorAttributes(requestAttributes, includeStackTrace);
        res.put("yz","yz");
        res.put("res",requestAttributes.getAttribute("res",0));
        return res;
    }
}
