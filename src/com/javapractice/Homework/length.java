package com.javapractice.Homework;
//2. Problem:
//Write a Java program to find and print the length of a given string using the length() method.
//
//Example:
//If the string is: "Welcome to Java"
//
//Expected Output:
//
//The string is: Welcome to Java
//Length of the string: 16
//Hint:
//
//Use the .length() method to get the total number of characters in the string.
//
//Remember, spaces also count as characters.

import java.util.Scanner;

public class length {
    public static void main(String[] args){
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String Given_str = String.valueOf(sc.nextLine());

        System.out.println(Given_str.length());
        sc.close();
    }
}
