package com.Internship.Calculator;

import com.Internship.DiscountCards.DiscountCard;

public class Calculator {

    private DiscountCard discountCard;

    public Calculator(DiscountCard discountCard){
        this.discountCard = discountCard;
    }

    public double calculateDiscount(){
        return discountCard.getPurchaseValue() * discountCard.getDiscountRate()/100;

    }

    public double calculateTotal(){
        return discountCard.getPurchaseValue() - calculateDiscount();
    }

}
