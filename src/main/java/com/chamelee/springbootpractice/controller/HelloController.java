package com.chamelee.springbootpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/getHello")
    public String getHello(){
        return "Hello from Spring Boot";
    }

    @GetMapping("/getHelloFromVar")
    public String getHelloFromVar(){
        String text = "Hello from Spring Boot as a variable";
        return text;
    }

}
