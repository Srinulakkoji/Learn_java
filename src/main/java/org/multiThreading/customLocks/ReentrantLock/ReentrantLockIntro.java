package org.multiThreading.customLocks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;
//different object but we want toallow 1 thread to go in use of the object
public class ReentrantLockIntro {
    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();

    public void producer (ReentrantLock lock){
        try{
            lock.lock();
            System.out.println("Lock acquired by "+ Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        }catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println("Lock release by  "+ Thread.currentThread().getName());
        }
    }

}
