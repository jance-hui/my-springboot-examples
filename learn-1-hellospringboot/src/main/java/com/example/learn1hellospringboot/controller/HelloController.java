package com.example.learn1hellospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learn1")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring Boot !";
    }
}
