package com.jdk8.juf;

import javafx.beans.binding.ObjectExpression;

public class ClassLoader2 {

    public static void main(String[] args) {
        Object object = new Object();


        ClassLoader2 classLoader2 = new ClassLoader2();
        System.out.println(classLoader2.getClass().getClassLoader().getParent().getParent());  //启动类加载器
        System.out.println(classLoader2.getClass().getClassLoader().getParent());  //扩展类加载器
        System.out.println(classLoader2.getClass().getClassLoader().getClass());  //应用类加载器

         //用户自定义类加载器

        //双亲委派机制和沙箱安全就是
        //我爸是李刚，有事找我爸 ，类加载先从 启动类加载器找起，先看看 根加载器中有没有，没有再看 扩展类加载其中有没有，如果还没有，
        //再看 应有程序加载器中有没有

        //防止源代码被污染，保证安全


    }
}
