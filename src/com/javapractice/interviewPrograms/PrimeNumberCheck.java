package com.javapractice.interviewPrograms;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it is prime:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;
        int count= 0;

        if(number<=1){
            System.out.println("Number is not prime");
        }

                for(int i=2; i<=Math.sqrt(number); i++){
                    count++;
                    if(number%i==0){
                        isPrime = false;
                        break;
                    }
                }

        System.out.println("Number of iterations: " + count);
                if(isPrime){
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }


main(
                new int[]{1, 2, 3, 4, 5}
        );




    }

    public static void main(int[] args){
        System.out.println("This is the main method with int[] args");
        for (int arg : args) {
            System.out.println(arg);
        }
    }
}
