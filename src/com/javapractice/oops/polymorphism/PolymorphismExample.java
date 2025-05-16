package com.javapractice.oops.polymorphism;

public class PolymorphismExample {

    int add(int a, int b) {
        return a + b;
    }


    int add( int a, int b, int c) {    //Nonstaic - Parameterized - return type
        return a + b + c;
    }

    double add(double a, double b) {  //Nonstatic - Parameterized - return type
        return a + b;
    }

    public static void main(String[] args) {
        PolymorphismExample obj = new PolymorphismExample();
        System.out.println(obj.add(10, 20)); // Calls the first add method
        System.out.println(obj.add(10, 20, 30)); // Calls the second add method
        System.out.println(obj.add(10.5, 20.5)); // Calls the third add method
    }
}

