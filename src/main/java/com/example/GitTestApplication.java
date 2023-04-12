package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        SpringApplication.run(GitTestApplication.class, args);
    }

}
