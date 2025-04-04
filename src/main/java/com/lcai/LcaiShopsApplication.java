package com.lcai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class LcaiShopsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LcaiShopsApplication.class, args);
    }

}
