package com.javapractice.PratikAssignments.Java;

public class Assignment10EncapsulationEx {
    private String name;
    private int age;

    // Constructor
    public Assignment10EncapsulationEx(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Assignment10EncapsulationEx obj = new Assignment10EncapsulationEx("John", 25);
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());

        obj.setName("Doe");
        obj.setAge(30);
        System.out.println("Updated Name: " + obj.getName());
        System.out.println("Updated Age: " + obj.getAge());
    }
}
