package com.javapractice.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        // Declaring an array
     //   int[] numbers;
   /*     int numbers[];

        // Initializing an array with size
        numbers = new int[5]; // Stores 5 integers

        //Assignment
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;*/
        int[] numbers = {10,20,30,40,50};
        System.out.println(numbers);
        // Accessing elements using index
        System.out.println("First Element: " + numbers[0]); // Output: 10
        System.out.println("Second Element: " + numbers[1]); // Output: 20
        // Changing the value at index 2
        numbers[2] = 100;
        System.out.println("Updated Third Element: " + numbers[2]); // Output: 100
    }
}

