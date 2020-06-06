package com.jdk8.juf;


import lombok.val;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * ForkJoinPool
 * ForkJoinTask
 * RecursiveTask
 *
 */
class Mytask  extends RecursiveTask<Integer> {


    private static final Integer ADJSUT_FINAL= 10;
    private int begin  ;
    private int end;
    private int  result;

    public Mytask(int begin,int end){
        this.begin= begin;
        this.end= end;
    }

    @Override
    protected Integer compute() {

        if((end-begin) <= ADJSUT_FINAL){

            for(int i =begin;i<= end;i++){
                result = result +i ;
            }
        }else{
           int middle = (begin + end) /2;
            Mytask mytask = new Mytask(begin,middle);
            Mytask mytask1 = new Mytask(middle+1, end);
            mytask.fork();
            mytask1.fork();
            result =  mytask.join() + mytask1.join();
        }
        return result;
    }
}

public class ForkJoinDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Mytask mytask = new Mytask(0,100);

        ForkJoinPool forkJoinPool = new ForkJoinPool();

        ForkJoinTask<Integer>    forkJoinTask = forkJoinPool.submit(mytask);

        System.out.println(forkJoinTask.get());

        forkJoinPool.shutdown();


    }

}
