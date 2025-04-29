package com.javapractice.operators;


import java.util.Scanner;

import static java.lang.System.*;

public class assignment {
    public static void main(String[] args) {
//      #  1. Print Even Numbers using Modulus Operator
//       # ( Clue : n%2==0 is even, n%2==1 is odd
//       # 2.Find sum of 100  numbers (Clue : loop i till 100 using for loop , make sum += i and print sum)

        out.println("Enter input");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0) {
            out.println("Even number");
        }
        else {
            out.println("Odd number");
        }

        out.println("Enter input for sum: ");
        int sumOfNumbers = sc.nextInt();

        int sum = 0;
        for(int i=1; i<=sumOfNumbers; i++){
            sum = sum + i;


        }
        out.println("Value of suum: "+ (sum) );


    }

}
