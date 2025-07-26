package org.multiThreading;

public class SharedResource {
    boolean isItemAvailable = false;

    public synchronized void addItem(){
        isItemAvailable = true;
        System.out.println("Inside add item method");
        notifyAll();
    }

    public synchronized void consumedItem(){

        while(!isItemAvailable){
            try {
                wait();
                System.out.println("Thread went waiting");
            }catch(Exception e){
                //Exception cateched here
            }
        }
        isItemAvailable = false;
        System.out.println("Item got consuumd ");
    }
}
