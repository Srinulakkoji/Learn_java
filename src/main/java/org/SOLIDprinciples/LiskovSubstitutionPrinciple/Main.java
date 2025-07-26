package org.SOLIDprinciples.LiskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {

        User user = new User(1,"Shreenu");
        UserExt ue = new UserExt(1,"Jaanu","External");

        Main m = new Main();
        m.printMe(user);
    }
    void printMe(User u) {
        u.print();
    }
}
