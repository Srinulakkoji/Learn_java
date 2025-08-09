package org.lombok;

import lombok.ToString;

@ToString(onlyExplicitlyIncluded = true)
public class ToStringTest {
    String name;
    @ToString.Include
    boolean commiteeMem;
}
