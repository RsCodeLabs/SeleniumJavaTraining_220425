package com.javapractice.Arrays;

public class ObjectArrayExample {
    public static void main(String[] args) {
        // Creating an array of Student objects
        Student[] students = new Student[3];


        // Initializing the array elements
        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 22);
        students[2] = new Student("Charlie", 21);

        // Accessing and displaying student details
        for (Student student : students) {
            System.out.println(student);
            student.display();
        }
    }
}
