package org.SOLIDprinciples.DependencyInversionPrinciple.DIP;

public class ShoppingMall {
    private DebitCard debitCard;

    public ShoppingMall(DebitCard debitCard){
        this.debitCard = debitCard;
    }

    public void doPurchaseThings(long amount){
        debitCard.doTransaction(amount);
    }


    public static void main(String[] args) {
        DebitCard db = new DebitCard();
        ShoppingMall sh = new ShoppingMall(db);
        sh.doPurchaseThings(1000);
    }
}
