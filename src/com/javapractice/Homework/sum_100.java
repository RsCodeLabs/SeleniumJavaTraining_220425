package com.javapractice.Homework;

/*2.Find sum of 100  numbers
(Clue : loop i till 100 using for loop , make sum += i and print sum)
 */

public class sum_100{
    public static void main(String[] args){
        int sum = 0;                                 //Otherwise, it would reset in each iteration.

        for (int i=1;  i<=100; i++){
            sum += i;
        }

        System.out.println("Sum of the first 100 numbers: " + sum);

    }
}
