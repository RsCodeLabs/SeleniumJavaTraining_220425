package com.javapractice.PratikAssignments.Java;

class Vehicle
{
    public String brand;

    public void start()
    {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle
{
    public void playMusic()
    {
        System.out.println("Playing music in the car");
    }
}

class Bike extends Vehicle
{
    public void doWheelie()
    {
        System.out.println("Doing a wheelie on the bike");
    }
}

public class Assignment13VehicleSystemInheritanceEx {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Hyundai";
        car.start();
        car.playMusic();

        Bike bike = new Bike();
        bike.brand = "Honda";
        bike.start();
        bike.doWheelie();

        System.out.println("Car brand: " + car.brand);
        System.out.println("Bike brand: " + bike.brand);
    }
}
