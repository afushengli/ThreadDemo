package com.fsl.mianshi;

class  Father{
    public   Father()
    {
        System.out.println("1111");
    }
    {
        System.out.println("2222");
    }
    static{
        System.out.println("3333");
    }
}

class Son  extends  Father  {
    public   Son()
    {
        System.out.println("4444");
    }
    {
        System.out.println("5555");
    }
    static{
        System.out.println("6666");
    }
}

public class TestStaticSeq {

    public static void main(String[] args) {
        System.out.println("77777777");
        new Son();
        System.out.println("=================");
        new Son();
        System.out.println("=================");
        new Father();

    }
}
