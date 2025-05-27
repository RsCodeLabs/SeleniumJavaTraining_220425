package com.javapractice.supriyaAssignments.java;
/*
Method Overloading: Create a class Printer with two print() methods:
One prints a message
One prints a number
Method Overriding: Create a class Vehicle with method run(), and a subclass Bike that overrides it.
*/

public class Assignment15Polymorphism {
    public static void main(String[] args) {
        Printer obj= new Printer();
        //Calling a print method with string as parameter
        obj.print("Its a wonderful day!!");
        //Calling a print method with number as parameter
        obj.print(100);
        Bike1 obj2=new Bike1();
        obj2.run();
    }
}
class Printer{
   void print(String s){
       System.out.println("Print method with string : " +s);
    }
    void print(int i){
        System.out.println(i);
    }
}

//Method Overriding: Create a class Vehicle with method run(), and a subclass Bike that overrides it.

class Vehicle1{
    void run(){
        System.out.println("Run method of the Vehicle class");
    }
}
class Bike1 extends Vehicle1{
    @Override
    void run(){//Method overriding
        System.out.println("Run method of the Bike class");
    }
}
