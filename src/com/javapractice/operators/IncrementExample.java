package com.javapractice.operators;

public class IncrementExample {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x;
        System.out.println("x: " + x);//7
        System.out.println("y: " + y);//12

        IncrementExample incrementExample = new IncrementExample();

    }
}
