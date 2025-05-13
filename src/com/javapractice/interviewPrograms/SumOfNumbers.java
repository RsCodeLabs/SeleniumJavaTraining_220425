package com.javapractice.interviewPrograms;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        System.out.println("Enter a number to calculate Sum: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = 0;
        for(int i=1; i<=number;i++)
        {
            sum = sum +i;
        }
        System.out.println("Sum of N numbers"+ sum);
    }
}
