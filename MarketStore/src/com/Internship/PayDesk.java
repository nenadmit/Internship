package com.Internship;

import com.Internship.Calculator.Calculator;
import com.Internship.DiscountCards.DiscountCard;

public class PayDesk {

    public static void print(DiscountCard discountCard){

        Calculator calculator = new Calculator(discountCard);

        System.out.println("Purchase value: $"+ discountCard.getPurchaseValue() );
        System.out.println("Discount rate: "+ discountCard.getDiscountRate()+"%" );
        System.out.println("Discount: $"+ calculator.calculateDiscount() );
        System.out.println("Total: $"+ calculator.calculateTotal());

    }

}

