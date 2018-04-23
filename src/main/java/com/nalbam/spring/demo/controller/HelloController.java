package com.nalbam.spring.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "nalbam") String name) {
        String greeting = this.restTemplate.getForObject("http://config-client/hello", String.class);
        return String.format("%s, %s!", greeting, name);
    }

}
