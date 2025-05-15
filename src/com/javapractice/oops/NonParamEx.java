package com.javapractice.oops;

public class NonParamEx {

    public void display(){
        System.out.println("Hello, this is a non-parameterized method.");
        System.out.println(12);
        System.out.println(12.5);
    }


    public static void main(String[] args) {

         new NonParamEx().display();
    }
}
