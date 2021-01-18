package com.spring.irisk.irisk.calculate;

public class ByteCal {


    public void add(Byte b)
    {
        b = b++;
    }
    public void test()
    {
        String str1="hello";


        /*
        *
        * //
        * */
        String str2="he"+ new String("llo");
        String str3 = "hello";

        System.out.println(str2);
        System.out.println(str1==str3);

        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a + " ");
        add(b);
        System.out.print(b + "");
    }
    public static void main(String[] args) {
        ByteCal c = new ByteCal();
        c.test();

    }
}
