package com.spring.irisk.irisk.test;

public class Test {

    public static void main(String[] args) {
        Integer n1 = new Integer(147);
        Integer n2 = new Integer(147);
        System.out.print(n1 == n2);
        System.out.print(",");
        System.out.println(n1 != n2);

        String a = new String("myString");
        String b = "myString";;
        String c = "my" + "String";
        String d = c;
        System.out.print(a == b);//false
        System.out.print(a == c);//false
        System.out.print(b == c);//true
        System.out.print(b == d);//true
    }
}
