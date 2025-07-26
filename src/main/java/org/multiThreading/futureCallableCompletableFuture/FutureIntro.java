package org.multiThreading.futureCallableCompletableFuture;

import java.util.concurrent.*;

public class FutureIntro {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS,new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        Future<?> futureObj = poolExecutor.submit(() -> {
            try {
                Thread.sleep(7000);
                System.out.println("This is task , which thread will execute");
            }catch (Exception e){
            }
        });

        System.out.println("is Done : " + futureObj.isDone());
        try{
            futureObj.get(2,TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            System.out.println("Timeout exception happended");
        }
        catch (Exception e){

        }

        try{
            futureObj.get();
        }catch (Exception e){

        }

        System.out.println("is done " + futureObj.isDone());
        System.out.println("is done " + futureObj.isCancelled());
    }
}
