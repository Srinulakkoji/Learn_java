package org.lombok;

import lombok.Builder;

@Builder
//created object immutable
//creates a builder class for you
// achieve immutability no setter will be there
public class BuilderTest {
    String name;
    Integer age;
}
