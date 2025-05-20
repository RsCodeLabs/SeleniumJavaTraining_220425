package com.javapractice.typeCastingExample;

public class TypeCastingExample {
    public static void main(String[] args) {
        //Implicit Casting
        short shortValue = 10;
        int intValue =shortValue;
        long longValue = intValue; // int to long
        float floatValue = longValue; // long to float
        double doubleValue = floatValue; // float to double

        System.out.println("Implicit Casting:");
        System.out.println("short to int: " + intValue);
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);

        //Explicit Casting
        double doubleValue2 = 10.534567755;
     float floatValue2  = (float)doubleValue2;
     long longValue2 = (long) floatValue2;
        int intValue2 = (int) longValue2; // long to int
        short shortValue2 = (short) intValue2; // int to short
        byte byteValue = (byte) shortValue2; // short to byte

        System.out.println("\nExplicit Casting:");
        System.out.println("double to float: " + floatValue2);
        System.out.println("float to long: " + longValue2);
        System.out.println("long to int: " + intValue2);
        System.out.println("int to short: " + shortValue2);

    }
}
