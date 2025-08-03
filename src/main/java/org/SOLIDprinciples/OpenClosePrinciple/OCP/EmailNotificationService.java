package org.SOLIDprinciples.OpenClosePrinciple.OCP;

public class EmailNotificationService implements NotificationService{
    @Override
    public void sendOtp(String medium) {
        //write logic to integrate email api
    }

    @Override
    public void sendTransactionReport(String medium) {
    //write logic to integrate email api
    }
}
