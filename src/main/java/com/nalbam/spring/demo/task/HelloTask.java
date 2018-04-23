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

    @Scheduled(fixedRate = 300)
    public void send() {
        log.info("Task : " + helloService.hello("Task", 100));
    }

    @Scheduled(fixedRate = 300)
    public void send20() {
        log.info("Task : " + helloService.hello20("Task20"));
    }

    @Scheduled(fixedRate = 300)
    public void send40() {
        log.info("Task : " + helloService.hello40("Task40"));
    }

    @Scheduled(fixedRate = 300)
    public void send60() {
        log.info("Task : " + helloService.hello60("Task60"));
    }

    @Scheduled(fixedRate = 300)
    public void send80() {
        log.info("Task : " + helloService.hello80("Task80"));
    }

}
