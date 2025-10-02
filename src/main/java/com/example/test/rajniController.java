package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rajniController {

    @GetMapping("/")
    public String home() {
        return "Hello,this is rajni !";
    }

    @GetMapping("/test")
    public String test() {
        return "its running";
    }
}