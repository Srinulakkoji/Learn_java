package org.SOLIDprinciples.LiskovSubstitutionPrinciple;

public class UserExt extends User{

    private String source ;

    UserExt (int id,String name, String source){
        super( id, name);
        this.source = source;
    }
}
