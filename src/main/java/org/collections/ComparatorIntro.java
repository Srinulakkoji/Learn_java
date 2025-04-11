package org.collections;

import java.util.Arrays;

public class ComparatorIntro {

    public static void main(String[] args) {
        Integer[] a = {6,4,1,9,2,11};
        Arrays.sort(a,(Integer val1, Integer val2) -> val1-val2);
// val1 - val2 is -- ascending and val2 - val1 is descending sorting in sorting
        System.out.println(Arrays.toString(a));

        for(int v : a){
            System.out.println(v);
        }

    }
}
