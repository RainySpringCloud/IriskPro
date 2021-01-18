package com.spring.irisk.irisk.calculate;

public class Add {



    public static void main(String[] args) {
        System.out.println(test());
        System.out.println(test1());

    }
    private static String test() {
        String temp = "k";
        try {
            int a = 6_1;
            System.out.println(a);
            System.out.println(temp);
            return "kl";
        } catch (Exception e) {
            System.out.println(temp);
            return "kc";
        } finally {
            temp = "ka";
            System.out.println(temp);
        }

    }


    private static int test1() {
        int temp = 1;
        try {
            System.out.println(temp);
            return ++temp;
        } catch (Exception e) {
            System.out.println(temp);
            return ++temp;
        } finally {
            ++temp;
            System.out.println(temp);
        }
    }
}
