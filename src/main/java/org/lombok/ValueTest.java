package org.lombok;

import lombok.NonNull;
import lombok.Value;

@Value
//once we use this as class level then it will mark entire class as final
//all fields are made as private and final
//setter are not generated but getter for all fields

public class ValueTest {
    String name;
    final Integer age;
    @NonNull String address;
}
