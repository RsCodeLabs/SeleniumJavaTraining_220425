package com.javapractice.oops;

public class StudentDefaultConstructor {

    StudentDefaultConstructor() {        // Default Constructor
        System.out.println("Default Constructor Called!");
    }
    public static void main(String[] args) {
        StudentDefaultConstructor obj = new StudentDefaultConstructor(); // Constructor gets called automatically
    }
}
