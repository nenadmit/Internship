package com.Internship;

import com.Internship.DiscountCards.DiscountCard;

public class PayDesk {

    public static void print(DiscountCard discountCard){

        System.out.println("Purchase value: $"+ discountCard.getPurchaseValue() );
        System.out.println("Discount rate: "+ discountCard.getDiscountRate()+"%" );
        System.out.println("Discount: $"+ calculateDiscount(discountCard) );
        System.out.println("Total: $"+ calculateTotal(discountCard));

    }

    private static double calculateDiscount(DiscountCard discountCard){
        return discountCard.getPurchaseValue() * discountCard.getDiscountRate()/100;

    }

    private static double calculateTotal(DiscountCard discountCard){
        return discountCard.getPurchaseValue() - calculateDiscount(discountCard);
    }

}

