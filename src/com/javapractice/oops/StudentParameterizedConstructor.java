package com.javapractice.oops;

//Example: Parameterized Constructor:
public class StudentParameterizedConstructor {
    String name;
    int age;

    public StudentParameterizedConstructor(){

    }

    // Parameterized Constructor
    public StudentParameterizedConstructor(String n, int a) {
        name = n;
        age = a;
    }

    StudentDefaultConstructor s = new StudentDefaultConstructor();
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        StudentParameterizedConstructor obj = new StudentParameterizedConstructor("John", 20);

        StudentParameterizedConstructor obj2 = new StudentParameterizedConstructor("Mandeep",25);

        obj.display();
        obj2.display();// Output: Name: John, Age: 20
    }

}



