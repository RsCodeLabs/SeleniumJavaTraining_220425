package com.javapractice.variables;

public class LocalVariableExample {
    int y;
    static int z=30 ;


    public static void main(String[] args) {
        int x = 10;
        System.out.println("Value of x: " + x);
        x=20;
        System.out.println("value of z:"+z);// Output: Value of x: 10
    }

    void Display(){

        System.out.println("Value of z: " + z);
    }
}
