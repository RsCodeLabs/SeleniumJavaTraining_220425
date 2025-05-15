package com.javapractice.oops;

public class Car {
    String brand;
    int year;

    public void start(){
        System.out.println(brand + " (" + year + ") is starting...");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand="Toyota";
        car1.year=2020;
        car1.start();  // Call method to display car info


        Car car2 = new Car();
        car2.brand="Honda";
        car2.year=2021;
        car2.start();




    }
}

