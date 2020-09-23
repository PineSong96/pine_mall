package com.pine.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PineAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(PineAuthApplication.class, args);
    }

}
