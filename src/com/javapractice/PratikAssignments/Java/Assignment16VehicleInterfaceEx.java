package com.javapractice.PratikAssignments.Java;

interface Vehiclee
{
    void start();
    void stop();
    void getSpeed(int speed);
}

class Carr implements Vehiclee
{
    @Override
    public void start()
    {
        System.out.println("Car started");
    }

    @Override
    public void getSpeed(int speed)
    {
        System.out.println("Speed: " + speed + " km/h");
    }

    @Override
    public void stop()
    {
        System.out.println("Car stopped");
    }
}

class Bikee implements Vehiclee
{
    @Override
    public void start()
    {
        System.out.println("Bike started");
    }

    @Override
    public void getSpeed(int speed)
    {
        System.out.println("Speed: " + speed + " km/h");
    }

    @Override
    public void stop()
    {
        System.out.println("Bike stopped");
    }
}

public class Assignment16VehicleInterfaceEx {
    public static void main(String[] args) {
        Vehiclee car = new Carr();
        car.start();
        car.getSpeed(100);
        car.stop();

        Vehiclee bike = new Bikee();
        bike.start();
        bike.getSpeed(60);
        bike.stop();
    }
}
