package org.multiThreading.customLocks.semaphoreLock;

import java.util.concurrent.Semaphore;

public class SharedResource {
    boolean isAvailable = false;
    Semaphore lock = new Semaphore(2);

    public void producer(){
        try{
            lock.acquire();
            System.out.println("Lock acquired for " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(6000);
        }catch(Exception e){
            //exception
        }finally {
            lock.release();
            System.out.println("Lock release by " + Thread.currentThread().getName());
        }
    }
}
