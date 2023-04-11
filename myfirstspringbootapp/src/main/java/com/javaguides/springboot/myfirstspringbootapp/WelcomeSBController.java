package com.javaguides.springboot.myfirstspringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeSBController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello, This is springboot helloworld application.";
    }
}
