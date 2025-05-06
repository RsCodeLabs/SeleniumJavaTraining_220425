package com.javapractice.Arrays;

class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
