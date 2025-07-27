package org.SOLIDprinciples.singleResponsibilityPrinciple.SRP;

public class LoanService {
    public void getLoanInterestInfo(String loanType){
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
}
