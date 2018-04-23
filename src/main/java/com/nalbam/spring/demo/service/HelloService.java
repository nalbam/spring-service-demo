package com.nalbam.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hello(String name, Integer rate) {
        String greeting = this.restTemplate.getForObject("http://config-client/hello?rate=" + rate, String.class);

        return String.format("%s, %s!", greeting, name);
    }

}
