package com.spring.irisk.irisk.aop.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTestClass {

    public static void main(String[] args) {
        ApplicationContext cat = new
                ClassPathXmlApplicationContext("app1.xml");
        TestService ts = (TestService)cat.getBean("target");
        ts.method1();

        System.out.println("-----");

        ts.method2();

    }
}
