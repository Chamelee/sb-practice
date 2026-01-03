package com.chamelee.springbootpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/getHello")
    public String getHelloo(){
        return "Hello from Spring Boot";
    }

}
