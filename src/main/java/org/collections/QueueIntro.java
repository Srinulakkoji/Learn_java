package org.collections;

import java.util.PriorityQueue;

public class QueueIntro {
    //child of collection interface
    //FIFO means p<-,q<- front ----- back p<-,q<-
        /*methods
        add() & offer()
        poll() & remove()
        peek() & element()
         */
    // two types of queues -- minpriorityqueue and maxPriorityQueue

    public static void main(String[] args) {
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        //with out defining parameter means default its minHeap
        //default it took natural order as MINHEAP
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);

        System.out.println("MinHead looks like this " + minPQ);
        minPQ.forEach((Integer val) -> System.out.println(val));

        while(!minPQ.isEmpty()){
            int val = minPQ.poll();
            System.out.println("removing from the top "+ val);
        }
        System.out.println("MinHead looks like this after removing from head  " + minPQ);
    }
}
