package com.javapractice.supriyaAssignments.java;
/* Create a Java program to model a basic vehicle system using inheritance.
Create a base class Vehicle with fields like brand and method start().
Create a class Car that extends Vehicle and adds a method playMusic().
Create a class Bike that extends Vehicle and adds a method doWheelie().
In the main method, create objects of Car and Bike and call their respective methods including the inherited one
*/

public class Assignment13Vehicle {
    public static void main(String[] args) {
        //In the main method, create objects of Car and Bike and call their respective methods including the inherited one
        Car car = new Car();
        Bike bike = new Bike();
        car.playMusic();
        car.start();
        bike.doWheelie();
        bike.start();

    }
}

