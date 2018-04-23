package com.nalbam.spring.demo.controller;

import com.nalbam.spring.demo.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "nalbam") String name,
                        @RequestParam(value = "rate", defaultValue = "100") Integer rate) {
        return helloService.hello(name, rate);
    }

}
