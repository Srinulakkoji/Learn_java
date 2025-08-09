package org.lombok;

import lombok.val;

public class LombokTest {
    public static void main(String[] args) {
        val temp = "hello";
        var a = 10;
        System.out.println(a);
        val b = 10;
        a = 30;
        System.out.println(temp + a + b);
    }
}
