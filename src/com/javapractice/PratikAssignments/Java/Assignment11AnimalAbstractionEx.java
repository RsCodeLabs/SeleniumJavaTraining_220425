package com.javapractice.PratikAssignments.Java;


abstract class Animal
{
    public abstract void makeSound();
}

class Dog extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Dog says: Woof!");
    }
}

class Cat extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Cat says: Meow!");
    }
}

public class Assignment11AnimalAbstractionEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}
