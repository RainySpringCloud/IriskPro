package com.spring.irisk.irisk.spring;



public class ServiceA {

    private ServiceB serviceB;

    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public ServiceA() {
        System.out.println("--Created Class ServiceA");
    }
}
