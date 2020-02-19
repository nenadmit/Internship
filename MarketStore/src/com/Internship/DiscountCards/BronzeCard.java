package com.Internship.DiscountCards;

public class BronzeCard implements DiscountCard {

    private String owner;
    private double discountRate = 0;
    private double turnover;
    private double purchaseValue;


    public BronzeCard(double turnover,double purchaseValue){

        if (turnover < 0 ){
            turnover = 0;
        }
        else if (purchaseValue<0){
        } purchaseValue=0;

        this.turnover = turnover;
        this.purchaseValue = purchaseValue;
    }

    @Override
    public double getPurchaseValue() {
        return purchaseValue;
    }

    @Override
    public double getDiscountRate() {
        if (turnover >= 100 && turnover <= 300){
            discountRate = 1.0;
        }
        else if(turnover>300){
            discountRate = 2.5;
        }
        return discountRate;
    }


}
