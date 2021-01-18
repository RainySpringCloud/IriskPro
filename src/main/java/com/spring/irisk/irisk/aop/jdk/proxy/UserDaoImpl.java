package com.spring.irisk.irisk.aop.jdk.proxy;

public class UserDaoImpl implements UserDao {

    //实现动态代理
    @Override
    public void add() {
        System.out.println("add...");
    }

    @Override
    public void delete() {
        System.out.println("delete...");
    }


}
