package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        String abcd = "abc";
        String specialBranchVariable = "123";
        SpringApplication.run(DemoApplication.class, args);
    }

}
