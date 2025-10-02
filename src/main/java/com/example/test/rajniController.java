package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rajniController {

    @GetMapping("/")
    public String home() {
        return "Hello,This is my working Docker & Spring Boot !";
    }

    @GetMapping("/test")
    public String test() {
        return "Test endpoint is running!";
    }
}