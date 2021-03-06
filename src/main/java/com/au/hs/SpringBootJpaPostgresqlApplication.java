package com.au.hs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.au.hs.SpringBootJpaPostgresqlApplication"})
public class SpringBootJpaPostgresqlApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaPostgresqlApplication.class, args);
    }
}