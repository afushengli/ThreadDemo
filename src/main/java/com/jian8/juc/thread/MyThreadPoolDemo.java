package com.jian8.juc.thread;

import java.util.concurrent.*;

/**
 * 第四种获得java多线程的方式--线程池
 */
public class MyThreadPoolDemo {
    public static void main(String[] args) {

        //   ExecutorService threadPool = Executors.newSingleThreadExecutor();
                //Executors.newFixedThreadPool(7);
               // Executors.newCachedThreadPool();

       //   System.out.println(Runtime.getRuntime().availableProcessors());   几核的cpu

        ExecutorService threadPool = new ThreadPoolExecutor(3,
                5,
                1L,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3),
                Executors.defaultThreadFactory(),

 //new ThreadPoolExecutor.AbortPolicy());
 // new ThreadPoolExecutor.CallerRunsPolicy());
 // new ThreadPoolExecutor.DiscardOldestPolicy());
  new ThreadPoolExecutor.DiscardPolicy());
        try {
            for (int i = 1; i <= 20; i++) {
                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t办理业务");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}
