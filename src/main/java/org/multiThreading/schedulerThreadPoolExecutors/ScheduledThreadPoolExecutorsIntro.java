package org.multiThreading.schedulerThreadPoolExecutors;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorsIntro {

    public static void main(String[] args) {

        ScheduledExecutorService poolObj = Executors.newScheduledThreadPool(5);

        Future<String> futureObj = (Future<String>) poolObj.schedule(() -> {
            System.out.println("Hello");
        },5, TimeUnit.SECONDS);
    }
}
