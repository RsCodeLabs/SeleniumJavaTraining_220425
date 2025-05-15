package com.javapractice.oops;

public class ParamExample {

    public static void add(int var1, int var2) {
        System.out.println("Sum: " + (var1 + var2));
    }

    public static void main(String[] args) {
        ParamExample obj = new ParamExample();
        obj.add(2,4);
    }
}
