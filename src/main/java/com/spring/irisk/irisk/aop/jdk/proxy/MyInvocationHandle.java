package com.spring.irisk.irisk.aop.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


//该类是要对目标对象进行代理 并进行功能增强的代理实现类
public class MyInvocationHandle implements InvocationHandler {

    //  要传入目标对象 构造方法最好
    Object obj;

    public MyInvocationHandle(Object obj) {
        super();
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj3;
        if(method.getName().equals("add")){
            System.out.println("223344");
            obj3 = method.invoke(obj,args);
            System.out.println("556677");
        }else{
            obj3 = method.invoke(obj,args);
        }

        return obj3;
    }
}
