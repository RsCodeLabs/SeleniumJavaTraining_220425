package com.javapractice.identifiers;

public class DataTypeExample {


    public static void main(String[] args) {
        // Primitive Data Types
        byte age = 30;                        // Employee age
        short joiningYear = 2020;             // Year of joining
        int employeeId = 1001;                // Employee ID
        long contactNumber = 9876543210L;     // Long number (e.g., phone number)
        float performanceRating = 4.5f;       // Rating out of 5
        double salary = 75000.55;             // Monthly salary
        char grade = 'A';                     // Grade level
        boolean isLoggedIn = true;            // Login status

        // Non-Primitive Data Types
        String employeeName = "Alice Johnson";           // Name of the employee
        int[] scores = {90, 85, 88};                      // Project scores

        // Output everything
        System.out.println("Employee Details:");
        System.out.println("------------------");
        System.out.println("Name           : " + employeeName);
        System.out.println("ID             : " + employeeId);
        System.out.println("Age            : " + age);
        System.out.println("Year Joined    : " + joiningYear);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Rating         : " + performanceRating);
        System.out.println("Salary         : $" + salary);
        System.out.println("Grade          : " + grade);
        System.out.println("Logged In?     : " + isLoggedIn);

        System.out.print("Project Scores : "+scores);
      /*  for (int score : scores) {
            System.out.print(score + " ");
        }*/
        System.out.println();
    }
}
