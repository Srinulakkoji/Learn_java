package org.multiThreading.practice;

public class SharedResource1 {

    boolean isAvailable = false;

    public synchronized void produce() {
        System.out.println("Lock acuired");
        isAvailable = true;
        try {
            Thread.sleep(8000);
        } catch (Exception e) {
            //exception here
        }
        System.out.println("Lock released");
    }
}
