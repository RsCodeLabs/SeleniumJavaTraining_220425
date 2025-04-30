package com.javapractice.interviewPrograms;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");

                /*for(int i ="321434343".length()-1; i>0; i--){
                    System.out.print("321434343".charAt(i));
                }*/

        int num = sc.nextInt();
        int reversedNum = 0;

        while(num!=0){
            int LastDigit = num % 10;
            reversedNum = reversedNum * 10 + LastDigit;
            num /=  10;
        }

        System.out.println("Reversed number is: " + reversedNum);
        sc.close();

    }
}
