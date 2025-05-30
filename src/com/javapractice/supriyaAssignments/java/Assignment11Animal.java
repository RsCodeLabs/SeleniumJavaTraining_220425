package com.javapractice.supriyaAssignments.java;

/*
Title: Animal Sound System
Objective: Use an abstract class to define behavior and let child classes implement it.
🔧 Requirements:
Create an abstract class Animal with an abstract method makeSound().
Create two child classes:
Dog → prints "Woof!"
Cat → prints "Meow!"
In the main() method:
Create objects of Dog and Cat
Call makeSound() for each
 */
 abstract class Assignment11Animal {

     abstract void makeSound();//Abstract method
     void display(){
         System.out.println("This is display method");
     }

    public static void main(String[] args) {
        Dog Objdog = new Dog();
        Cat ObjCat = new Cat();
        Objdog.makeSound();
        ObjCat.makeSound();

    }
 }
    class Dog extends Assignment11Animal {
        @Override
        void makeSound() {
            System.out.println("Dog says: Woof!");
        }
    }
    class Cat extends Assignment11Animal {
        @Override
            void makeSound () {
            System.out.println("Cat says: Meow!");
        }
    }

