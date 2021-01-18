package com.spring.irisk.irisk.aop.jdk.proxy;

import org.apache.catalina.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {

        UserDao userDao = new UserDaoImpl();

        //jdk动态代理
        InvocationHandler h = new MyInvocationHandle(userDao);
        Object newProxyInstance =  Proxy.newProxyInstance
                (userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(),h);
        UserDao proxy = (UserDao)newProxyInstance;
        proxy.add();
        System.out.println("-------");
        proxy.delete();
    }
}
