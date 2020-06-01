package com.fsl.mianshi;


public class CodeBlocking03 { //主类CodeBlocking03.class ===> 主类CodeBlocking03.Class
    {
        System.out.println("CodeBlocking03 构造块444");
    }

    static{
        System.out.println("CodeBlocking03 静态代码块555");
    }


    public CodeBlocking03(){
        System.out.println("CodeBlocking03 构造方法66666");
    }

    public static void main(String[] args) {
        System.out.println("==我是美丽分割线============CodeBlocking main方法777");
        new code();
        System.out.println("============");
        new code();
        System.out.println("============");
        new CodeBlocking03();

    }
}

class code {

    public  code (){
        System.out.println("code 构造方法111");
    }
    {
        System.out.println("code 构造块222");
    }
    static {
        System.out.println("code 静态代码块333");
    }




}