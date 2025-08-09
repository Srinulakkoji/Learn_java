package org.lombok;

import lombok.Data;
import lombok.NonNull;

@Data
//this data is equivalent to  equals , tostring and hashcode
//getter and setters and requiredargsconstructor
public class DataTest {
    String name;
    final Integer id;
    @NonNull String address;
}
