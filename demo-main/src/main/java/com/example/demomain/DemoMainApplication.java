package com.example.demomain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.example.*.restcontroller" })
public class DemoMainApplication {

    public static void main(final String[] args) {
        SpringApplication.run(DemoMainApplication.class, args);
    }

}
