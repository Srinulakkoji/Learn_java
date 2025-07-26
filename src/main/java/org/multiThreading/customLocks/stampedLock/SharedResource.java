package org.multiThreading.customLocks.stampedLock;


import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable = false;
    StampedLock lock = new StampedLock();

    public  void producer(){
        long stamp = lock.readLock();
        try{
            System.out.println("Read lock acquired by " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(8000);
        } catch (Exception e) {
            //
        }finally {
            lock.unlockRead(stamp);
            System.out.println("read lock release by " + Thread.currentThread().getName());
        }
    }

    public void consume(){
        long stamp = lock.writeLock();
        try {
            System.out.println("Write lock acuqired by " + Thread.currentThread().getName());
            isAvailable = false;
        } catch (Exception e) {
            //
        }finally {
            lock.unlockWrite(stamp);
            System.out.println("Write lock released by " + Thread.currentThread().getName());
        }
    }
}

