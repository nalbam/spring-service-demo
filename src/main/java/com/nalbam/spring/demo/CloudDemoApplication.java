package com.nalbam.spring.demo;

import com.nalbam.spring.demo.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name = "config-client", configuration = RibbonConfig.class)
public class CloudDemoApplication {

    public static void main(final String[] args) {
        SpringApplication.run(CloudDemoApplication.class, args);
    }

}
