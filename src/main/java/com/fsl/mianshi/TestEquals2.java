package com.fsl.mianshi;

public class TestEquals2 {
    public static void main(String[] args) {
        String s1 =  "abc";
        String  s2 = new String("abc");
        String s3 ="abc";
        String s4 ="xxx";
        String s5 = "abc"+"xxx";
        String s6 = s3+ s5 ;

        System.out.println(s1== s2);
        System.out.println(s1== s5);
        System.out.println(s1== s6);

        System.out.println(s1== s6.intern());
        System.out.println(s2 == s2.intern());  //第一个s2 指向堆 , 第二个指向常量池，在JDK 7及其以前常量池在永久区，
        // 但是在JDK8以后常量池 在元空间中


    }
}
