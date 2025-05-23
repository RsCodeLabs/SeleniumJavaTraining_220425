package com.javapractice.supriyaAssignments.java;
/*
 Requirements:
Create a class Student with private fields:
name (String)
age (int)
Add public getter and setter methods for both fields.
In the main() method:
Create an object of Student
Set name and age
Print the values using getter methods
 */
public class Assignment10Student {

    private String name;
    private int age;

    public Assignment10Student(String name, int age)
    {
        //Assigning parameter values to variables
        this.name = name;
        this.age = age;
    }
    public String getName()
    {
        System.out.println("Student Name is " + name);
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        System.out.println("Student Age is " + age);
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public static void main(String[] args) {
        Assignment10Student obj = new Assignment10Student("Saanvi", 5);
        System.out.println("Initial Name and Age values from getter methods: ");
        obj.getName();
        obj.getAge();
        obj.setName("Srinidhi");
        obj.setAge(10);
        System.out.println("After updating the Name and Age values using setter methods and then displaying the new values using getter methods: ");
        obj.getName();
        obj.getAge();
    }
}
