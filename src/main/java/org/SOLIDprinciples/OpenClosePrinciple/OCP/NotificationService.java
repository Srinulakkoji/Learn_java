package org.SOLIDprinciples.OpenClosePrinciple.OCP;

public interface NotificationService {

    public void sendOtp(String medium);

    public void sendTransactionReport(String medium);
}
