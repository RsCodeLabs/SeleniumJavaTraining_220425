package com.javapractice.oops;

public class NonStaticMethodExample {
    public void greet() {
        System.out.println("Hello, welcome to Java2!");
    }

    public static void main(String[] args) {

        NonStaticMethodExample example = new NonStaticMethodExample();
        example.greet(); // Calling the non-static method using the object
        StaticMethodExample.greet();
        StaticMethodExample.display();

    }
}

// Static - Meant for Class level - can be access using ClassName i.e Classsname.methodName
// Non-Static - Meant for Object level - can be access using ObjectName i.e Classname object = new Classname(); object.methodName
