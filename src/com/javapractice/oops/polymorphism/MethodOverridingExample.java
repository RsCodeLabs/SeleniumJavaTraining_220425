package com.javapractice.oops.polymorphism;


class Parent5 {

    void profession(int year) {
        System.out.println("Become A Doctor by"+ year);
    }

    void property() {
        System.out.println("Property of 200 Milions");
    }
}


class Child5 extends Parent5 {

    void profession(int year){
        System.out.println("Become An Actor by"+ year);
    }


}


public class MethodOverridingExample {
    public static void main(String[] args) {
        Child5 c = new Child5();
        c.profession(2055);
        c.property();


        Parent5 parent = new Parent5();
        parent.profession(2055);
        parent.property();

       Parent5 p2=  new Child5();
       p2.profession(2015);


    }

}
