package com.spring.irisk.irisk.aop.chlib.proxy;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CallbackMethod implements MethodInterceptor {

    @Override
    public Object intercept(Object proxy, Method method, Object[] objects,
                            MethodProxy methodProxy) throws Throwable {
        System.out.println("uzi");
        Object obj = methodProxy.invokeSuper(proxy,objects);
        System.out.println("kod");
        return obj;
    }
}
