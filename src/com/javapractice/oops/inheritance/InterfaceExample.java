package com.javapractice.oops.inheritance;


 interface Animal3 {
    void makeSound();
}


class Dog3 implements Animal3 {


    @Override
    public void makeSound() {

    }

    class Cat4 implements Animal3 {
        public void makeSound() {
            System.out.println("Cat meows");
        }
    }

    public class InterfaceExample {
        public static void main(String[] args) {
            Dog3 dog = new Dog3();
            dog.makeSound(); // Output: Dog barks

        }

    }
}