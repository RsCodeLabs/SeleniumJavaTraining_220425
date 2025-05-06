package com.javapractice.interviewPrograms;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        System.out.println("Enter 3 number. Enter ");
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Calculate the sum
        int sum = num1 + num2 + num3;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + num3 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }


}
