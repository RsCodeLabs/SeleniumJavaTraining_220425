package com.javapractice.oops.inheritance;


class Animal {
    String color;
    void eat(){
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("Dog barks.");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new  Dog();
        dog.bark();
        dog.color="black";
        dog.eat();
    }

}
