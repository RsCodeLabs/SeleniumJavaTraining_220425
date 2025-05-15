package com.javapractice.OOPS;

public class Calculator {
    public void add(int a, int b){
        System.out.println("Method to add two numbers (with parameters) : "+a+b);
    }

    public void substract(int a, int b){
        System.out.println("Method to add two numbers (with parameters) : " + (a-b));
    }
    public void welcome(){
        System.out.println("Method to print a welcome message (no parameters)");
    }

    public static void developerInformation(){
        System.out.println("Method to show Deepaly info (static, no parameters)\n");
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(2,3);
        cal.substract(10,6);
        cal.welcome();
        developerInformation();
    }

}
