package com.javapractice.supriyaAssignments.java;
/*
Write a Java program that:
Reads an array of numeric strings, e.g. {"12", "5", "-3", "20"}.
Uses wrapper-class utility methods to convert them to integers.
Computes and prints both the sum and the average (as a double).
 */
public class Assignment20WrapperClasses {

    public static void main(String[] args) {
        String[] arr = {"12", "5", "-3", "20"};
        double Sum = 0;
        double Average = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("String element before conversion to INTEGER at index " + i + " is : " + arr[i]);
            Integer int1 = Integer.valueOf(arr[i]);
            System.out.println("String element after conversion to INTEGER at index " + i + " is : "+ int1);
            Sum = Sum + int1;
            Average = Sum/(i+1);
        }
        System.out.println("Sum of the elements is: " + Sum);
        System.out.println("Average of the elements is: " + Average);
    }
}

