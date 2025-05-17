package com.javapractice.superThisFinalKeywords;


class Parent{
    int num2= 100;

    Parent(){
        System.out.println("Parent Constructor");
    }

    void show(){
        System.out.println("Parent show method");
    }
}



class Child extends Parent{
    int num= 200;

    Child(){

        System.out.println("Child Constructor");
    }

    void display(){
        super.show();
        System.out.println("Value is "+super.num2);
        System.out.println("Child display method");
    }


}
public class SuperExample {
    public static void main(String[] args) {
       Child c = new Child();
               c.display();

    }
}
