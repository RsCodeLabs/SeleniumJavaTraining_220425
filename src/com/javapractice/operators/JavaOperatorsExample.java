package com.javapractice.operators;

public class JavaOperatorsExample {

    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));         // 15
        System.out.println("Subtraction: " + (a - b));      // 5
        System.out.println("Multiplication: " + (a * b));   // 50
        System.out.println("Division: " + (a / b));         // 2
        System.out.println("Modulus: " + (a % b));          // 0

        // Relational Operators
        System.out.println("Is a > b? " + (a > b));         // true
        System.out.println("Is a == b? " + (a == b));       // false

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical AND: " + (x && y));     // false
        System.out.println("Logical OR: " + (x || y));      // true
        System.out.println("Logical NOT: " + (!x));         // false

        // Assignment Operators
        int num = 20;
        num += 10;  // num = num + 10
        System.out.println("After += : " + num);            // 30

        // Unary Operators
        int c = 5;
        System.out.println("Unary minus: " + (-c));         // -5
        System.out.println("Post-increment: " + (c++));     // 5 (then c becomes 6)
        System.out.println("Pre-increment: " + (++c));      // 7

        // Bitwise Operators
        int p = 5, q = 3;
        System.out.println("Bitwise AND: " + (p & q));      // 1
        System.out.println("Bitwise OR: " + (p | q));       // 7
        System.out.println("Bitwise XOR: " + (p ^ q));      // 6
        System.out.println("Bitwise Complement of p: " + (~p)); // -6

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Maximum using ternary: " + max); // 10

        // Shift Operators
        int shift = 8;
        System.out.println("Left shift: " + (shift << 2));   // 32
        System.out.println("Right shift: " + (shift >> 2));  // 2
    }
}
