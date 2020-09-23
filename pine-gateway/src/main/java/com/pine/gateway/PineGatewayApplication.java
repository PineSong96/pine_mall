package com.pine.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PineGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PineGatewayApplication.class, args);
    }

}
