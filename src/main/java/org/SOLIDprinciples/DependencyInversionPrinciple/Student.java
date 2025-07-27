package org.SOLIDprinciples.DependencyInversionPrinciple;

public class Student {
    private Address address;
    Student(){
        address = new Address();
    }
}
