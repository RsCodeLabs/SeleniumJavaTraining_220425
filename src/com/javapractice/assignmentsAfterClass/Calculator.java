package com.javapractice.assignmentsAfterClass;
 /*
    Include:
    •   Method to add two numbers (with parameters)
    •   Method to subtract two numbers (with parameters)
    •   Method to print a welcome message (no parameters)
    •   Method to show developer info (static, no parameters)
     */
public class Calculator {
    public int addNum(int a,int b) {
        System.out.println("Sum of numbers "+ a + " and " + b + "  is :  " + (a+b));
        return (a+b);
    }
    public int subNum(int a1, int b1) {
        System.out.println("Substraction of numbers "+ a1 + " and " + b1 +  " is : " + (a1-b1));
        return (a1-b1);
    }
    public void print() {
        System.out.println("Welcome to Java world! ");
    }
    public static void devInfo() {
        System.out.println("Developer of this program is : SUPRIYA P! ");
    }

public static void main(String[] args) {
    Calculator calObj1 = new Calculator();
    calObj1.addNum(12,13);
    calObj1.subNum(30,10);
    calObj1.print();
    Calculator.devInfo();
}
}
