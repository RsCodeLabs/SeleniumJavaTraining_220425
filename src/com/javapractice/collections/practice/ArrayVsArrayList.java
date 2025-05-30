package com.javapractice.collections.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        // 1. Array - Fixed size and homogeneous (only one type)
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Mango";

        System.out.println("Array elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Disadvantage: Cannot add more than 3 elements
        // fruits[3] = "Grapes"; // Compile-time error: ArrayIndexOutOfBoundsException if uncommented

        // Disadvantage: Only homogeneous data allowed
        // fruits[0] = 100; // Compile-time error: incompatible types

        // 2. ArrayList - Dynamic size and can hold heterogeneous data if Object type
        ArrayList<Object> items = new ArrayList<>(List.of("Hello", 123, 45.67, true, 'A'));

        System.out.println("\nArrayList elements (heterogeneous):");
        for (Object item : items) {
            System.out.println(item + " (" + item.getClass().getSimpleName() + ")");
        }
    }

}
