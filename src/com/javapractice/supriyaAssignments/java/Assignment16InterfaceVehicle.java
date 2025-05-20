package com.javapractice.supriyaAssignments.java;
/*
Requirements:
Create an interface Vehicle with methods:
start(), stop(), getSpeed()
Create two classes Car and Bike that implement Vehicle:
Car: speed = 100 km/h
Bike: speed = 60 km/h
In main(), use the Vehicle interface to call methods on both Car and Bike.
 */

public class Assignment16InterfaceVehicle {
    public static void main(String[] args) {
        CarI car = new CarI();
        BikeI bike = new BikeI();
        car.startI1();
        car.getSpeedI1(100);
        car.stopI1();
        bike.startI1();
        bike.getSpeedI1(60);
        bike.stopI1();
    }
}

interface VehicleI {
    // Create an interface Vehicle with methods:
    //start(), stop(), getSpeed()
    default void startI1() {

    }
    default void stopI1() {

    }
    default void getSpeedI1(int x) {

    }
}
//Car: speed = 100 km/h
//Bike: speed = 60 km/h

class CarI implements VehicleI{
    public void startI1() {
        System.out.println("Car Started ..");
    }
    public void stopI1() {
        System.out.println("Car Stopped .. ");
    }
    public void getSpeedI1(int speed) {
        System.out.println("Car Speed = "+speed +" km/h");
    }
}

class BikeI implements VehicleI{
    public void startI1() {
        System.out.println("Bike Started .. ");
    }
    public void stopI1() {
        System.out.println("Bike Stopped .. ");
    }
    public void getSpeedI1(int speed) {
        System.out.println("Bike Speed = "+speed+ " km/h");
    }
}

