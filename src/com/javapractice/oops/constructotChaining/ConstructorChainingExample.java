package com.javapractice.oops.constructotChaining;

class Animal{

     Animal(){
         System.out.println("Default Animal constructor called");
     }


    Animal(String type){
        System.out.println("Animal type: " + type);
    }

}

class Dog extends Animal{


    Dog(){
        this("Bulldog");//Calling other constructor in the same class
        System.out.println("Default Dog constructor called");
    }

    Dog(String  breed){
        super("Mammal"); // Calling parent class constructor
        System.out.println("Dog breed: " + breed);
    }
}

public class ConstructorChainingExample {
    public static void main(String[] args) {
        new Dog();
    }
}
