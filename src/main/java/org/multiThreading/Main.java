package org.multiThreading;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResourceObj = new SharedResource();

        Thread producerThread =  new Thread(() -> {
            try{
                Thread.sleep(5000);
            }catch(Exception e){
                //exception caought here
            }
            sharedResourceObj.addItem();
        });

        Thread consumerThread = new Thread(() -> {
            sharedResourceObj.consumedItem();
        });

        producerThread.start();
        consumerThread.start();
    }
}
