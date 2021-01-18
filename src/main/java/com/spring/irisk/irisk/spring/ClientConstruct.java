package com.spring.irisk.irisk.spring;

import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientConstruct {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("cache.xml");

        ServiceA a = context.getBean("a",ServiceA.class);
        ServiceB b = context.getBean("b",ServiceB.class);


    }
}
