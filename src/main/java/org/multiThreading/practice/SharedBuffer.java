package org.multiThreading.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SharedBuffer{

    private Queue<Integer> sharedBufferObj;
    private int bufferSize;

    public SharedBuffer(int bufferSize){
        sharedBufferObj = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void addItem(int item) throws Exception{
        while (sharedBufferObj.size() == bufferSize){
            System.out.println("add item thread waiting ");
            wait();
        }
        sharedBufferObj.add(item);
        System.out.println("Item added" + item);
        notify();
    }

    public synchronized int consumeItem() throws Exception{

        while(sharedBufferObj.isEmpty()){
            System.out.println("buffer empty ");
            wait();
        }
        int item = sharedBufferObj.poll();
        System.out.println(" consumd " + item);
        notify();
        return item;
    }
}
