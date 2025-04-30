package com.javapractice.interviewPrograms;

import java.util.Scanner;

public class FibanacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the number of terms in the Fibonacci series:");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int first = 0;
        int second = 1;
        int next;

        System.out.println("Fibonacci Series up to " + n + " terms:");


        for (int i = 0; i < n; i++) {
            System.out.print(" " + first);
            next = first + second;
            first = second;
            second = next;

        }
        scanner.close();
    }





}
