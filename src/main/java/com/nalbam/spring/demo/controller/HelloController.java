package com.nalbam.spring.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "nalbam") String name,
                        @RequestParam(value = "rate", defaultValue = "100") Integer rate) {
        String greeting = this.restTemplate.getForObject("http://config-client/hello?rate=" + rate, String.class);

        return String.format("%s, %s!", greeting, name);
    }

}
