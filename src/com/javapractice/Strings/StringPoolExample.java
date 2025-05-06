package com.javapractice.Strings;

public class StringPoolExample {
    public static void main(String[] args) {
        // Creating a string using string literal
        String s1 = "Hello";

        // Creating another string with the same value using string literal
        String s2 = "hello";

        // Since both s1 and s2 have the same value and are created using literals,
        // Java stores them in the String Pool and makes them refer to the same object.

        // Comparing memory locations using '=='
        System.out.println(s1 == s2); // true (Both refer to the same object in the String Pool)
        //Since both s1 and s2 point to the same "Hello" object in the String Pool, it returns true.
    }
}
