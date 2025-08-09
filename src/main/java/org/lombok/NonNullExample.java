package org.lombok;

import lombok.NonNull;

public class NonNullExample {
    public void demo(@NonNull String name){
        System.out.println("There " + name);
    }

    public static void main(String[] args) {
        NonNullExample obj = new NonNullExample();
        obj.demo("shreenu");
        System.out.println("here " + obj);
    }
}
