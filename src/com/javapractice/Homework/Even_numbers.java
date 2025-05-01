package com.javapractice.Homework;

/*1. Print Even Numbers using Modulus Operator        // Question
( Clue : n%2==0 is even, n%2==1 is odd  */

import java.util.Scanner;                              // when we create scanner class this automatically come.

public class Even_numbers {
    public static void main(String[] args){

        System.out.print("Enter upper limit: ");       //upto which number user want
        Scanner sc = new Scanner(System.in);
        int endNumber = sc.nextInt() ;                 //stores input inside the variable named "endNumber"

        for(int i=0;   i<=endNumber;   i++){           // intial valee for i we assingned is 0 . it gets incremented upto upper limit
            if(i%2==0){
                System.out.println(i);                  // printing the even numbers
            }
        }
        sc.close();
    }
}
