package com.javapractice.PratikAssignments.Java;

public class Assignment10StudentEncapsulationEx {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Assignment10StudentEncapsulationEx obj = new Assignment10StudentEncapsulationEx();
        obj.setName("John");
        obj.setAge(20);
        System.out.println("Student Name: " + obj.getName());
        System.out.println("Student Age: " + obj.getAge());
    }
}
