package com.javapractice.supriyaAssignments.java;

public class Assignment5AverageofNos {
    public static void main(String[] args) {
        int sum =0;
        int average;
        int[] array1 = {10, 20, 30, 40, 50};
        int count = array1.length;
        System.out.println("Initial array:");
        for (int array2 : array1)
        {
            System.out.println(+array2);
            sum = sum+array2;
            System.out.println("Sum of the numbers is : " +sum );
        }
           average = sum/count;
        System.out.println("Average of numbers is : " + average);
    }
}