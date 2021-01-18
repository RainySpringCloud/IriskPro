package com.spring.irisk.irisk.controller;

import com.spring.irisk.irisk.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {


    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);


    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/async")
    public String submit(){
        logger.info("start submit");
        asyncService.executeAsync();
        logger.info("end submit");
        return "success";
    }
}
