package com.fsl.mianshi;

public class Singleton {

    private volatile static Singleton  singleton = null;

    private Singleton (){

    }

    public  static Singleton  getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        for (int i = 0 ;i<=10;i++){
             new Thread(()->{
                 Singleton s1 = Singleton.getInstance();
                 Singleton s2 = Singleton.getInstance();
                 System.out.println(Thread.currentThread().getName() + "\t"  + (s1==s2));
             },"Thread "+i).start();
        }
    }

}
