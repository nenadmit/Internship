package com.company;


import java.util.*;
import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args){

       int[] test = makeRandomArray(500,5);
       System.out.println(brothersInTheBar(test));

       }

       // Method is static so it can be run from the static main method
       public static int brothersInTheBar(int[] glasses){

        // If there are less than 2 items in an array the result will be 0.
        if(glasses.length<=2)
            return 0;

        // Making an instance of an ArrayList and populating it
        // with elements of an int array.

        ArrayList<Integer> glassesAsList = new ArrayList<Integer>();
        Arrays.stream(glasses).forEach(i -> glassesAsList.add(i));

        int counter=0;

        // For loop iterates glassesAsList.size()-2 times since the algorithm check for items at indexes x+1 and x+2
        // and would throw IndexOutOfBoundsException if two last items were checked.

        for (int x=0;x<glassesAsList.size()-2;++x){

            //Returns true if there are three same consecutive numbers and resets the loop
            if(glassesAsList.get(x) == glassesAsList.get(x+1) && glassesAsList.get(x) == glassesAsList.get(x+2)){
                glassesAsList.remove(x);
                glassesAsList.remove(x);
                glassesAsList.remove(x);
                counter++;
                x=-1;
            }

            //if the list is empty, it breaks the for loop so the method doesn't throw IndexOutOfBoundsException
            if(glassesAsList.isEmpty())
                break;
        }
     return counter;
    }


    public static int[] makeRandomArray(int size,int rangeOfNumbers){

        int[] arr = new int[size];
        int[] range = IntStream.rangeClosed(1, rangeOfNumbers).toArray();

        Random random = new Random();

        for(int x=0;x<size;x++)
            arr[x] = random.nextInt(rangeOfNumbers)+1;


        return arr;
    }


}
