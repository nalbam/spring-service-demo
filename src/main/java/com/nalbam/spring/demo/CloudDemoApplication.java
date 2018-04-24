package com.nalbam.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudDemoApplication {

    public static void main(final String[] args) {
        SpringApplication.run(CloudDemoApplication.class, args);
    }

}
