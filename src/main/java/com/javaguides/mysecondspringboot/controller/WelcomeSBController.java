package com.javaguides.mysecondspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeSBController {
    @GetMapping("/welcome")
    public String hello() {
        return "Hello, This is springboot's second helloworld application.";
    }
}
