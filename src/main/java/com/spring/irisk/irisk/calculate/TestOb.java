package com.spring.irisk.irisk.calculate;

public class TestOb {

    private int s = 0;

    public static void main(String[] args){
        Object o=new Object(){
            public boolean equals(Object obj){
                return true;
            }
        };
        System.out.println(o.equals("dsa"));
        TestOb sa = new TestOb();
        Object i= 'a';
        char sq = '\u0639';
        String qe = "sa\0";
        Double wq = 100.0;
        float w = 99;
    }
}
