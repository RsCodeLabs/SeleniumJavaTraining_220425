package com.javapractice.interviewPrograms;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it is prime:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;

        if(number<=1){
            System.out.println("Number is not prime");
        }


                for(int i=2; i<=number/2; i++){
                    if(number%i==0){
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime){
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }





    }
}
