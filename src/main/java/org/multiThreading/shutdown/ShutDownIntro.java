package org.multiThreading.shutdown;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ShutDownIntro {
    public static void main(String[] args) {

        ExecutorService poolExecutorObj = Executors.newFixedThreadPool(5);
        poolExecutorObj.submit(() -> {
            try{
                Thread.sleep(20000);
            }catch (Exception e){
            }
            System.out.println("New Task");
        });

        //poolExecutorObj.shutdown();
        poolExecutorObj.shutdownNow();
        //await terminated is used after shutdown
//        try {
//        boolean isTerminated = poolExecutorObj.awaitTermination(2, TimeUnit.SECONDS);
//        System.out.println("Is terminated " + isTerminated);
//        }catch(Exception e){
//        }
        System.out.println("Main thread unblocked and fininshed processing ");
    }
}
