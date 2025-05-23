package com.javapractice.supriyaAssignments.java;

public class AnimalSoundSystem {
    public static void main(String[] args) {
        Assignment11Animal dog1 = new Dog();
        System.out.println("From Dog class:");
        dog1.makeSound();
        dog1.display();
        Assignment11Animal cat1 = new Cat();
        System.out.println("From Cat class:");
        cat1.makeSound();
        cat1.display();

    }
}
