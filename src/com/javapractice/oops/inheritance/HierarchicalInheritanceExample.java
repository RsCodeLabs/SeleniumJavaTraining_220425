package com.javapractice.oops.inheritance;

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}


public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
     Dog dog = new com.javapractice.oops.inheritance.Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();


    }
}
