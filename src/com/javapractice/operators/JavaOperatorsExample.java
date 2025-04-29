package com.javapractice.operators;

public class JavaOperatorsExample {
    public static void main(String[] args) {

        //Arthimetic operators
        int a = 100;
        int b = 20;
        System.out.println("Addition is :"+ (a+b));
        System.out.println("Modules is :"+ (a%10));

        //Relational operatots
        System.out.println("Is a>b? :"+ (a > b));
        System.out.println("Is a,b? :"+ (a < b));

        //Logical operators
        boolean x=true,y=false;
        System.out.println("Logical And:"+ (x && y));
        System.out.println("Logical OR:"+ (x || y));
        System.out.println("Logical NOT:"+ (!x));
        System.out.println((3<5) || (1/0 == 0)); // This will not throw exception as when the first condition is false the next would not be evaluated.

        //Assignment operators
        System.out.println("After +="+ (a+=b));
        System.out.println("After *="+ (a*=b));

        //Unary Operator
        int c = 5;
        System.out.println(c++);
        System.out.println(c);
        System.out.println(c--);
        System.out.println(c);
        System.out.println(++c);
        System.out.println(c );
        System.out.println(--c);
        System.out.println(c);


    }
}
