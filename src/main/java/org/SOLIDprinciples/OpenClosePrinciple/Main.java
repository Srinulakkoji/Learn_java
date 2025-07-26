package org.SOLIDprinciples.OpenClosePrinciple;

public class Main {
    public static void main (String[] args){
        User user = new User(1,"SHreenu");
        ExtUser extUser = new ExtUser("External",2,"Janu");
        user.print();
        extUser.print();
    }
}
