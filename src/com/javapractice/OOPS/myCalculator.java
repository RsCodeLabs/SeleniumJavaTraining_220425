package com.javapractice.OOPS;

public class myCalculator {
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
        myCalculator cal = new myCalculator();
        cal.add(2,3);
        cal.substract(10,6);
        cal.welcome();
        new myCalculator().welcome();

        developerInformation();
    }

}
