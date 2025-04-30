package com.javapractice.operators;

public class UnaryExample {
    public static void main(String[] args) {
        int a = 11;
        int x = ++a;
        System.out.println(x); //12
        System.out.println(a); //12

        int b =21;
        int y = --b;
        System.out.println(y); //20

        int c=31;
        int z = c++;
        System.out.println(z); //31
        System.out.println(c); //32

        int d= 41;
        int w = d--;
        System.out.println(w); //41
        System.out.println(d); //40
    }
}
