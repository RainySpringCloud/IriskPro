package com.spring.irisk.irisk.pro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {


    @org.junit.Test
    public void test(){
        AnnotationConfigApplicationContext app = new
                AnnotationConfigApplicationContext(CDPlayerConfig.class);
        String[] str = app.getBeanDefinitionNames();
        for(String name : str){
            System.out.println(name);
        }
    }
}
