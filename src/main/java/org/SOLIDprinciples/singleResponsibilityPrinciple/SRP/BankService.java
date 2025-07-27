package org.SOLIDprinciples.singleResponsibilityPrinciple.SRP;

public class BankService {
    public long deposit(long amount,String accountNo){
        System.out.println("Enter amount: "+ amount);
        return 0;
    }

    public long withDraw(long amount,String accountNo){
        System.out.println("Enter amount: "+ amount);
        return 0;
    }
    //below methods are commented due to these are violating SRP principle
    //so creating indi classes to handles these cases

    /*public void getLoanInterestInfo(String loanType){
        if(loanType.equals("homeLoan")){
            System.out.println("Interest is 8% ");
        }
        if(loanType.equals("personalLoan")){
            System.out.println("Interest is 12% ");
        }
        if(loanType.equals("car")){
            System.out.println("Interest is 14% ");
        }
    }

    public void printPassBook(){
        System.out.println("Printing your passbook please wait ");
    }

    public void sendOTP(String medium){
        if(medium.equals("email")){
            System.out.println("Please check your email");
        }
        if(medium.equals("mobile")){
            System.out.println("Please check your mobile");
        }
    }*/
}
