package com.chamelee.springbootpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/addNumQue")
    public int addNumQue(@RequestParam int num){
        int result = 5 + num;
        return result;
    }

    @GetMapping("/addNumPath/{num}")
    public int addNumPath(@PathVariable int num){
        int result = 5 + num;
        return result;
    }

}
