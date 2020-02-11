package com.Internship.DiscountCards;

public class SilverCard implements DiscountCard {

    private String owner;
    private double discountRate = 2;
    private double turnover;
    private double purchaseValue;


    public SilverCard(float turnover, float purchaseValue) {

        if (turnover < 0 || purchaseValue <0){
            turnover = 0;
            purchaseValue=0;
        }

        this.turnover = turnover;
        this.purchaseValue = purchaseValue;
    }


    @Override
    public double getPurchaseValue() {
        return purchaseValue;
    }

    @Override
    public double getDiscountRate() {

        if (turnover > 300)
            discountRate = 3.5;

        return discountRate;
    }

}