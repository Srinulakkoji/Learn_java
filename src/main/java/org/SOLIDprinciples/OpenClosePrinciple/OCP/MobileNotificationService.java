package org.SOLIDprinciples.OpenClosePrinciple.OCP;

public class MobileNotificationService implements NotificationService{
    @Override
    public void sendOtp(String medium) {
        //twillio API
    }

    @Override
    public void sendTransactionReport(String medium) {
        // write logic to send OTP to MOBILE
    }
}
