package com.fsl.mianshi;


import java.util.HashSet;

public class TestEquals {
    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String ("abc");
        System.out.println(str1 ==  str2);

        HashSet hs = new HashSet();
        hs.add(str1);
        hs.add(str2);
        System.out.println(hs.size());


        System.out.println("==================");

        Person p1  = new Person("沾上干");
        Person p2  = new Person("沾上干");
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        HashSet h2 = new HashSet();
        h2.add(p1);
        h2.add(p2);
        System.out.println(h2.size());


    }
}

