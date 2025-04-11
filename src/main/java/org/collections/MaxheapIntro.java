package org.collections;

import java.util.PriorityQueue;

public class MaxheapIntro {
    //using comparator we can acheive maxheap
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((Integer a,Integer b) -> b-a);
        //hear we are explicitely passing paramenters to achieve maxHeap
        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);

        System.out.println("Max heaps looks like " + maxPQ);

        maxPQ.forEach((Integer val) -> System.out.println(val));
        while(!maxPQ.isEmpty()){
            int val = maxPQ.poll();
            System.out.println("removing from the top " + val);
        }

        System.out.println("Max heap after poll" + maxPQ);
    }
}
