package com.spring.irisk.irisk.spring;




public class ServiceB {

    private ServiceA serviceA;

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public ServiceB(){
        System.out.println("--Created Class ServiceB");
    }
}
