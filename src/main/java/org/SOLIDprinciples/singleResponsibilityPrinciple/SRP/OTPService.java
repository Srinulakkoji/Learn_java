package org.SOLIDprinciples.singleResponsibilityPrinciple.SRP;

public class OTPService {
    public void sendOTP(String medium){
        if(medium.equals("email")){
            System.out.println("Please check your email");
        }
        if(medium.equals("mobile")){
            System.out.println("Please check your mobile");
        }
    }
}
