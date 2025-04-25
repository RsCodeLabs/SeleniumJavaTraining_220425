package com.javapractice.identifiers;

public class JavaLiteralsExample {

    public static void main(String[] args) {

        // 1. Integer Literals
        int decimalNum = 100;       // Decimal
        int binaryNum = 0b1010;     // Binary
        int octalNum = 0123;        // Octal
        int hexNum = 0x1A3F;        // Hexadecimal

        System.out.println("Integer Literals:");
        System.out.println("Decimal     : " + decimalNum);   // 100
        System.out.println("Binary      : " + binaryNum);    // 10
        System.out.println("Octal       : " + octalNum);     // 83
        System.out.println("Hexadecimal : " + hexNum);       // 6719
        System.out.println();

        // 2. Floating-Point Literals
        float pi = 3.14f;           // Float literal
        double price = 19.99;       // Double literal

        System.out.println("Floating-Point Literals:");
        System.out.println("Float Value  : " + pi);          // 3.14
        System.out.println("Double Value : " + price);       // 19.99
        System.out.println();

        // 3. Character Literals
        char letter = 'J';
        char symbol = '#';
        char unicodeChar = '\u0041'; // Unicode for 'A'

        System.out.println("Character Literals:");
        System.out.println("Letter      : " + letter);       // J
        System.out.println("Symbol      : " + symbol);       // #
        System.out.println("Unicode Char: " + unicodeChar);  // A
        System.out.println();

        // 4. String Literals
        String message = "Hello, Java!";

        System.out.println("String Literal:");
        System.out.println("Message      : " + message);     // Hello, Java!
        System.out.println();

        // 5. Boolean Literals
        boolean isJavaFun = true;
        boolean isRainy = false;

        System.out.println("Boolean Literals:");
        System.out.println("Is Java Fun? : " + isJavaFun);   // true
        System.out.println("Is it Rainy? : " + isRainy);     // false
    }
}
