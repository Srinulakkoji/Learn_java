package org.SOLIDprinciples.OpenClosePrinciple;

public class NotificationService {
    public void sendOTP(String medium){
        if(medium.equals("email")){
            // email related logic
        }
        if(medium.equals("mobile")){
            //logic using using twillio API
        }
    }
}
