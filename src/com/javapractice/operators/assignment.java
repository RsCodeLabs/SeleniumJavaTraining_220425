package com.javapractice.operators;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
//      #  1. Print Even Numbers using Modulus Operator
//       # ( Clue : n%2==0 is even, n%2==1 is odd
//       # 2.Find sum of 100  numbers (Clue : loop i till 100 using for loop , make sum += i and print sum)



        for(int n=0;n<=100;n++)
        {
            if(n%2==0){
                System.out.println("Even number: "+n);
            }
        }



        int tsum =0;
        for(int j=0;j<=100;j++)
        {
            tsum+=j;
        }
        System.out.println("sum of all the numbers: "+tsum);



        System.out.println("Enter input");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }

        System.out.println("Enter input for sum: ");
        int sumOfNumbers = sc.nextInt();

        int sum = 0;
        for(int i=1; i<=sumOfNumbers; i++){
            sum = sum + i;


        }
        System.out.println("Value of sum: "+ (sum) );


    }

}
