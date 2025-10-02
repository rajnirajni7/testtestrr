package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
        System.out.println("Spring Boot Test Application Started...");
    }

    // Functions we want to test
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    // Simple REST endpoint
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Test Application!";
    }

    // REST endpoint to test add
    @GetMapping("/add")
    public int addNumbers(@RequestParam int a, @RequestParam int b) {
        return add(a, b);
    }

    // REST endpoint to test multiply
    @GetMapping("/multiply")
    public int multiplyNumbers(@RequestParam int a, @RequestParam int b) {
        return multiply(a, b);
    }
}
