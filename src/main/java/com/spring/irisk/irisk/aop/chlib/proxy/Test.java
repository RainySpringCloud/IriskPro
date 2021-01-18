package com.spring.irisk.irisk.aop.chlib.proxy;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;

public class Test {
    public static void main(String[] args) {

        Enhancer en = new Enhancer();//空的字节码对象
        en.setSuperclass(Student.class);//生成父类的字节码文件
        Callback call = new CallbackMethod();
        en.setCallback(call);
        Student stu = (Student)en.create();
        stu.study();
}

}
