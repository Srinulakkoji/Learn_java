package org.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PRIVATE) @Setter(AccessLevel.PRIVATE)
public class GetterSetterTest {
    String name;
    int id ;
    @Setter(AccessLevel.NONE)
    static int maxTime;
}
