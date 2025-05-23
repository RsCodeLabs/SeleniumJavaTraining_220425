package com.javapractice.supriyaAssignments.java;
/*
Requirements:
Create a Person class with:
final String country = "India";
A method display() that prints: "Person from India"
Create a class Employee that extends Person:
Override the display() method and use super.display() inside it.
Print: "Employee working in IT sector"
In main(), create an object of Employee and call display().
 */
public class Assignment17EmployeeDetails {
    public static void main(String[] args) {
        Employee17 emp17 = new Employee17();
        emp17.display();
    }
}

class Person{
    final String country = "India";
    void display(){//that prints: "Person from India"
        System.out.println( "Person from India");
    }
}

class Employee17 extends Person{
    @Override
    void display(){
        //that prints: "Employee working in IT sector"
        super.display();
        System.out.println("Employee working in IT sector");
    }
}