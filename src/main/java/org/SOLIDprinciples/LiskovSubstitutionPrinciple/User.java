package org.SOLIDprinciples.LiskovSubstitutionPrinciple;

public class User {
    private int id;
    private String name ;

    User(int id,String name){
        this.id = id;
        this.name = name;
    }

    void print(){
        System.out.println("User id :"+ id + " User name :" + name);
    }
}
