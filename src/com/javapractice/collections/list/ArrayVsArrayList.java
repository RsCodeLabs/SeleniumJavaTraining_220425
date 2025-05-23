package com.javapractice.collections.list;

import java.util.HashSet;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        String[] fruitsArray = new String[3];
        fruitsArray[0] = "Apple";
        fruitsArray[1] = "Banana";
        fruitsArray[2] = "Cherry";
        System.out.println("Array:"+ fruitsArray);
        // fruitsArray[3] = "Date"; // This will cause an ArrayIndexOutOfBoundsException

       // fruitsArray[0] = 10; // This will cause a compile-time error, as the array is of type String

//Arraylist
        HashSet<Object> fruitsList = new HashSet<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Cherry");
        fruitsList.add("Cherry");
        fruitsList.add("Date"); // This is allowed, as ArrayList can grow dynamically
    fruitsList.add(10); // This is allowed, as ArrayList can hold different types of objects
        fruitsList.add(10.5); // This is allowed, as ArrayList can hold different types of objects
        fruitsList.add(true); // This is allowed, as ArrayList can hold different types of objects


        System.out.println("ArrayList:"+ fruitsList);

        // Print the elements of the array

    }
}
