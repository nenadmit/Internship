package com.Internship;

import com.Internship.DiscountCards.BronzeCard;
import com.Internship.DiscountCards.GoldCard;
import com.Internship.DiscountCards.SilverCard;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------BRONZE CARD---------------");
        PayDesk.print(new BronzeCard(0,989879879));

        System.out.println("---------SILVER CARD---------------");
        PayDesk.print(new SilverCard(600,850));

        System.out.println("---------GOLD CARD---------------");
        PayDesk.print(new GoldCard(1500,1300));

    }
}
