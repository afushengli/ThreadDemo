package com.fsl.mianshi;

public class StringTest {

    public static void main(String[] args) {

        String str1 ="abc";
        String str2 = "abc";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println("===========================");


        String str3 ="abc";
        String str4 = new String("abc");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        System.out.println("===========================");


        String str5 ="a"+"b"+"c";
        String str6 = new String("abc");
        System.out.println(str5 == str5);
        System.out.println(str5.equals(str6));
        System.out.println("===========================");



        String str7 ="ab";
        String str8 = "abc";
        String str9= str7 +"c";

        System.out.println(str8 == str9);
        System.out.println(str8.equals(str9));







    }
}
