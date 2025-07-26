package org.multiThreading.customLocks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        ReentrantLockIntro re1 = new ReentrantLockIntro();
        Thread th1 = new Thread(() -> {
            re1.producer(lock);
        });

        ReentrantLockIntro re2 = new ReentrantLockIntro();
        Thread th2 = new Thread(() -> {
            re2.producer(lock);
        });

        th1.start();
        th2.start();
    }
}
