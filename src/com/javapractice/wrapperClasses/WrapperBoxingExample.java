package com.javapractice.wrapperClasses;

import java.util.ArrayList;

public class WrapperBoxingExample {
    public static void main(String[] args) {

        Integer num = 10; // Autoboxing - Converting primitive to wrapper class


        // Unboxing - Converting wrapper class to primitive
        int n1 = num; // Unboxing

        System.out.println("Integer value: " + num);
        System.out.println("Primitive int value: " + n1);

    }
}
