package com.javapractice.wrapperClasses;

public class WrapperMethods {
    public static void main(String[] args) {
        String num = "123";
        Integer numValue = Integer.valueOf(num); // Convert String to Integer
        int primitiveValue = numValue; // Convert Integer to int
        String numString = numValue.toString();
        int i = Integer.min(3,5); // Find minimum of two integers
        int n2 = Integer.parseInt("456");
        //Convert String to int

        //Double
        double pi = Double.parseDouble("3.14"); // Convert String to double

       boolean isTrue =  Boolean.parseBoolean("Truedsa");


        System.out.println("String to Integer: " + numValue);
        System.out.println("Integer to int: " + primitiveValue);
        System.out.println("Integer to String: " + numString);
        System.out.println("Minimum of 3 and 5: " + i);
        System.out.println("String to int: " + n2);
        System.out.println("String to double: " + pi);
        System.out.println("String to boolean: " + isTrue);

    }
}
