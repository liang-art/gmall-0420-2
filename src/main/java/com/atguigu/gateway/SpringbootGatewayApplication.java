package com.atguigu.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGatewayApplication.class, args);
    }

}
