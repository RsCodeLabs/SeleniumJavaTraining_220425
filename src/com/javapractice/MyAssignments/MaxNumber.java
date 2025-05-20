package com.javapractice.MyAssignments;

public class MaxNumber {


 public static void main(String[] args) {

    int[] numbers = {-3, 7, 2, 9, 5}; // Example array
    int max = findMax(numbers);
    System.out.println("The maximum number is: " + max);
   }

   public static int findMax(int[] array) {
    int b = Integer.MAX_VALUE;
    int a = Integer.MIN_VALUE;
//    int max = array[0]; // Assume the first element is the largest
    for (int num : array) {
     if (num > a) {
      a = num; // Update max if a larger number is found
     }
    }
    return a;
   }
  }

