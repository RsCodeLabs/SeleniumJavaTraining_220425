package com.javapractice.PratikAssignments.Java;

class Vehicle1
{
    public void run()
    {
        System.out.println("Vehicle is running");
    }
}

class Bike1 extends Vehicle1
{
    @Override
    public void run()
    {
        System.out.println("Bike is running safely");
    }
}

public class Assignment15_2MethodOverridingEx {
    public static void main(String[] args) {
        Bike1 b = new Bike1();
        b.run();
    }
}
