# Summary

The method first checks if the length of an array is less that 2 and returns 0 if that condition is true.

If the size of provided array is greather than 2, new instance of an ArrayList is created and populated with the items 
from an Array. 

The algoritm iterates over the list .size()-2 number of times since last two numbers are already being checked and as to prevent IndexOutOfBound exception.

"If" statement inside the "for" loop checks if there are three same consecutive numbers (items at index x,x+1 and x+2), if the condition is true, the numbers are removed from the list,count is incrased by one and the loop resets.

Last "if" statement check if the list is empty and breaks the loop as to prevent IndexOutOfBoundException.
 
