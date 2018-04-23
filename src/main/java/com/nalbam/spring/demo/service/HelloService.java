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

    public String hello20(String name) {
        String greeting = this.restTemplate.getForObject("http://config-client/hello20", String.class);
        return String.format("%s, %s!", greeting, name);
    }

    public String hello40(String name) {
        String greeting = this.restTemplate.getForObject("http://config-client/hello40", String.class);
        return String.format("%s, %s!", greeting, name);
    }

    public String hello60(String name) {
        String greeting = this.restTemplate.getForObject("http://config-client/hello60", String.class);
        return String.format("%s, %s!", greeting, name);
    }

    public String hello80(String name) {
        String greeting = this.restTemplate.getForObject("http://config-client/hello80", String.class);
        return String.format("%s, %s!", greeting, name);
    }

}
