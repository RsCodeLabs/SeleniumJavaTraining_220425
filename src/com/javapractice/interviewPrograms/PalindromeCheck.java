package com.javapractice.interviewPrograms;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {

        System.out.println("Enter a string to check if it is a palindrome:");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println("You entered: " + input);

      //  String reversed = new StringBuilder(input).reverse().toString();
        // Creating a StringBuilder object to reverse the string
        //reversed using StringBuilder's reverse() method
        // and converting it back to a string using toString()


       char[] strArray =  input.toCharArray();
       for(int i = strArray.length-1; i>=0; i--){
              System.out.print(strArray[i]);
       }





       /* if(input.equalsIgnoreCase(reversed)){
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }*/
        sc.close();












    }
}
