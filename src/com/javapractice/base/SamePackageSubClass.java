package com.javapractice.base;

public class SamePackageSubClass extends BaseClass {

    public void accessFromBase(){
        System.out.println("Accessing from SamePackageSubClass");
        System.out.println("Public variable: " + publicVar);
        System.out.println("Protected variable: " + protectedVar);
        System.out.println("Default variable: " + defaultVar);
       //  System.out.println("Private variable: " + privateVariable); // Not accessible
    }
}
