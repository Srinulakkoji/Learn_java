package org.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections1 {

    //Iterator used to traverse collections
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(4);
        values.add(6);
        values.add(8);

        System.out.println("List values are "+ values);

        if(values.contains(8)){
            System.out.println("yes its present");
        }

        Iterator<Integer> valIter = values.iterator();
        while(valIter.hasNext()){
            int val = valIter.next();

            System.out.println("Iterator looped "+ val);
            if (val == 4)
            {
                valIter.remove();
            }
        }
        System.out.println("After remove method invoked "+ values);
        values.remove(Integer.valueOf(8));
        System.out.println("Using value bases remove() method" + values);

        values.forEach((Integer val1) -> System.out.println(val1));

    }
}
