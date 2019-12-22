package com.example.config.act;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAct {
//    @Value("${hello}")
    private String hello = "hello";

    @GetMapping("/hello")
    public String hello(){
        return hello;
    }
}
