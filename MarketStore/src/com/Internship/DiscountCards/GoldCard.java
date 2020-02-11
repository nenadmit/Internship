package com.Internship.DiscountCards;

public class GoldCard implements DiscountCard {

    private String owner;
    private double discountRate = 2;
    private double turnover;
    private double purchaseValue;


    public GoldCard(double turnover, double purchaseValue){

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

       discountRate = (int) turnover / 100 + 2;

       if(discountRate > 10)
           discountRate=10;

        return discountRate;
    }




}
