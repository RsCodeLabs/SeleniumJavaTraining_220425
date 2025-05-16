package DeepalyAssignments.Java.JavaAssignments.OOPSbasics;

/***
 * Topic: Abstraction
 * Java Assignment 11:
 * Title: Animal Sound System
 * Objective: Use an abstract class to define behavior and let child classes implement it.
 * 🔧 Requirements:
 * Create an abstract class Animal with an abstract method makeSound().
 * Create two child classes:
 * Dog → prints "Woof!"
 * Cat → prints "Meow!"
 * In the main() method:
 * Create objects of Dog and Cat
 * Call makeSound() for each
 * ✅ Expected Output:
 * Dog says: Woof!
 * Cat says: Meow!
 */
public abstract class Assignment11AbstractionBasic {

    abstract void makeSound();
    void display(){
        System.out.println("This is display method");
    }
}

 class Dog extends Assignment11AbstractionBasic{

    @Override
    void makeSound() {
        System.out.println("Dog says: Woof!");

    }
}

class Cat extends Assignment11AbstractionBasic{

    @Override
    void makeSound() {
        System.out.println("Cat says: Meow!");

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
    }
}

