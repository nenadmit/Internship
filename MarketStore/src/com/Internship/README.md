 # Summary

The application consists of four parts.

#Main class as an Entry point.

#PayDesk class with a static method "print" with DiscountCard interface as an argument which outputs the info to the console.

#Third part of the applications is in the package com.Internship.DiscountCards. It consists of an DiscountCard interface and 
Bronze/Silver/Gold Card classes which implement the DiscountCard interface.

Each "Card Class" has an "owner", "discountRate", "turnover" and "purchaseValue" fields, Overrides two methods from the interface and 
 a Constructor with two arguments (turnover, purchaseValue).

#Calculator Class with has DiscountCards interface as a field and two methods : calculateDiscount() and calculateTotal()

In the Main method, we can call PayDesk.print() method and insert an instance of a Card class as an argument. 
*//PayDesk.print(new GoldCard(500,1000);//

The print() method of PayDesk class makes an instance of Calculator class. First it takes the data from a Card 
class and prints the data in the first two rows. The next two rows are ouputed using methods of a Calculator class.
