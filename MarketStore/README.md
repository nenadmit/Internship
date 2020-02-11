# Summary

The application consists of three parts.

#Main class as an Entry point.

#PayDesk class with a static method "print" with DiscountCard interface as an argument which outputs the info to the console and two private static methods calculateDiscount() and calculateTotal(), which take DiscountCard interface as an argument as well.

Third part of the applications is in the package .DiscountCards. It consists of an DiscountCard interface and Bronze/Silver/Gold Card classes which implement the DiscountCard interface. 

Each "Card Class" has an "owner", "discountRate", "turnover" and "purchaseValue" fields and Overrides two methods from the interface.

In the Main method, we can call PayDesk.print() method and insert an instance of a Card class as an argument.
---PayDesk.print(new GoldCard(500,1000);---

The print() methods call the methods from PayDesk class and prints the needed info on the console.
