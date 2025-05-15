package com.javapractice.assignmentsAfterClass;
/*
🔰 Sample Output:
Static Method without params called
Static Method with params: Sum is 30
Non-Static Method without params called
Non-Static Method with params: Hello, John!
*/

public class UserDefinedMethods {
//One static method without parameters
    public static void display1() {
    System.out.println("Static Method without params called");
    }
//One static method with parameters
    public static void add(int a,int b) {
    System.out.println("Static Method with params: Sum is " + (a+b));
    }

//One non-static method without parameters
public void display2() {
    System.out.println("Non-Static Method without params called");
}
//One non-static method with parameters
public void display3(String s) {

    System.out.println("Non-Static Method with params: "+ s);
}
    public static void main(String[] args) {
        //No need to create an object for Static method
        display1();
        add(25,5);
        UserDefinedMethods obj= new UserDefinedMethods();
        obj.display2();
        obj.display3("Hello, John!");
    }
}
