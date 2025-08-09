package org.lombok;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class EqualsAndHashcodeTest {
    String name;
    @EqualsAndHashCode.Exclude
    boolean commiteeMem;
    //boolean value we have assigned as exclude so it will be excluded from the class file
    static  int maxTerm = 10;
    //static aslo excluded only non static and non final variables got hashcode and equal methods
}
