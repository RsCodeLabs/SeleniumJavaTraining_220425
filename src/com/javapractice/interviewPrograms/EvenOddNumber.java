package com.javapractice.interviewPrograms;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number =  scanner.nextInt();
        if(number%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is Odd");
        }
        scanner.close();
    }
}
