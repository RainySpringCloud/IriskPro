package com.spring.irisk.irisk.config;


import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Hello {


    @Async("taskExecutor")
    public void sayHello(String name){

        System.out.println(Thread.currentThread().getName() + " ----" + name);
    }

}
