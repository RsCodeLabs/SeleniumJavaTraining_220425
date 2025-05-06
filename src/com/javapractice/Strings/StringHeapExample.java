package com.javapractice.Strings;

public class StringHeapExample {
    public static void main(String[] args) {
        // Creating a string using 'new String()' - A new object is created in Heap memory
        String s3 = new String("Hello");

        // Creating a string using a string literal - Stored in the String Pool
        String s4 = "Hello";

        // 's3' is stored in Heap memory as a separate object
        // 's4' refers to the same "Hello" object from the String Pool

        // Comparing memory locations using '=='
        System.out.println(s3 == s4); // false (Different memory locations)
        // Comparing actual content using .equals()
        System.out.println(s3.equals(s4)); // true (Both have the same text value)
    }
}

