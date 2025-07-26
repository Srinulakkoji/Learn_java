package org.multiThreading.threadPool;

import java.util.concurrent.*;

public class ThreadPoolExecutorIntro {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10,
                TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), new CustomThreadFactory(), new CustomRejectHandler());

        for (int i = 1; i <= 5; i++){
            executor.submit(() -> {
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    //excelption
                }
                System.out.println(("Task processed by " + Thread.currentThread().getName()));
            });
        }
        executor.shutdown();
    }
}

class CustomThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        th.setPriority(Thread.NORM_PRIORITY);
        th.setDaemon(false);
        return th;
    }
}

class CustomRejectHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println();
    }
}

/*4 tasks here im submitting min 2 and max 4
* queue size 2*/