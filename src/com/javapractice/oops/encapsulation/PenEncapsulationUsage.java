package com.javapractice.oops.encapsulation;

public class PenEncapsulationUsage {
    public static void main(String[] args) {

        PenEncapsulationEx penEncapsulationEx = new PenEncapsulationEx();
        System.out.println("name of the pen"+penEncapsulationEx.getName());
        penEncapsulationEx.setColor("Red");
        System.out.println("color of the pen"+penEncapsulationEx.getColor());



    }
}
