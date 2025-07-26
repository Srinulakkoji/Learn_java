package org.multiThreading.practice;

public class Main {
    public static void main(String[] args) {
  //      SharedBuffer sharedBufferObj = new SharedBuffer(3);
        SharedResource1 sharedObj = new SharedResource1();
//
//        Thread addThread = new Thread(() ->{
//            try{
//                for(int i= 1; i <=6;i++){
//                    sharedBufferObj.addItem(i);
//                }
//            }catch(Exception e){
//                //exception caought here
//            }
//        });
//
//        Thread consumeThread = new Thread(() -> {
//            try{
//                for(int i = 1; i <=6; i++){
//                    sharedBufferObj.consumeItem();
//                }
//            }catch (Exception e){
//                //exception
//            }
//        });
//
//        addThread.start();
//        consumeThread.start();

        System.out.println("Main thread started");

        Thread th1 = new Thread(() ->{
            System.out.println("Thread calling produce method");
            sharedObj.produce();
        });

       // th1.setDaemon(true);
        //it will not wait for th1 for 8 seconds if the main method ends this deamon th1 was also ends
        th1.start();

        try{
            System.out.println("main thread is waiting to get thread th1 get finished");
            th1.join();
        }catch (Exception e){
            //exception e
        }

        System.out.println("Main thread finished it worth");

    }
}
