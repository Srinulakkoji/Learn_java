package org.lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class ConstructorAnnotations {
    String name;
    boolean commiteeMem;
    @NonNull Integer age;
    // No args constructor will be generated
    /*public class ConstructorAnnotations(){
    }
    * */

    //All orgs constructor generate with null check for  age and also generated with all fields

    //Required args constructor will generates only NON NULL field such as age one with added null check

}
