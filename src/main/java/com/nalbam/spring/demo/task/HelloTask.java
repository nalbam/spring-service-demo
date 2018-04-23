package com.nalbam.spring.demo.task;

import com.nalbam.spring.demo.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HelloTask {

    @Autowired
    private HelloService helloService;

    @Scheduled(fixedRate = 1000)
    public void send() {
        log.info("Task : " + helloService.hello("Task", 90));
    }

}
