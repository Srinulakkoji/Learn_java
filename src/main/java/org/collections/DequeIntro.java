package org.collections;

import java.util.ArrayDeque;

public class DequeIntro {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrDQasQueue = new ArrayDeque<>();
        arrDQasQueue.addFirst(1);
        arrDQasQueue.addLast(2);
        arrDQasQueue.addFirst(5);
        arrDQasQueue.push(5);
        System.out.println(arrDQasQueue);

        arrDQasQueue.forEach((Integer val) -> System.out.println(val)); 

        ArrayDeque<Integer> arrDQasStack = new ArrayDeque<>();
    }
}
