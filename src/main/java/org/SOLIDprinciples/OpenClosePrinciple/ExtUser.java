package org.SOLIDprinciples.OpenClosePrinciple;

public class ExtUser extends User {
    private String userSource;

    ExtUser(String userSource,int id,String name){
        super(id,name);
        this.userSource=userSource;
    }
}
