package com.springtoken.springboot_token;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootTokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTokenApplication.class, args);
    }

}
