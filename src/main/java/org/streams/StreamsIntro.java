package org.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsIntro {
    public static void main(String[] args) {
        List<Integer> salary = Arrays.asList(3000,1000,2000);

        Stream<Integer> salaryStream = salary.stream();
        List<Integer> itrasList1 = salaryStream.collect(Collectors.toList());
        System.out.println(itrasList1 + " Is created" );

        Stream<Integer> streamFromItr = Stream.iterate(1000,(Integer n )-> n+1000).limit(5);
        List<Integer> itrasList2 = streamFromItr.collect(Collectors.toList());
        System.out.println(itrasList2 + " Is created" );

        //filter
        Stream<String> names = Stream.of("HELLO", "THIS","IS","SHREENU");
        List<String> namesfilter = names.filter((String name) -> name.length() > 3)
                .collect(Collectors.toList());
        System.out.println(namesfilter+" is filtered");


        List<String> nums = Arrays.asList("2","4","1","7");
        IntStream numsStream = nums.stream().mapToInt((String val) -> Integer.parseInt(val));

        int numsArr [] = numsStream.toArray();

        IntStream numStream2 = Arrays.stream(numsArr).filter((int val) -> val <7);
        System.out.println(numStream2.toArray() + "Is printed ");
    }
}
