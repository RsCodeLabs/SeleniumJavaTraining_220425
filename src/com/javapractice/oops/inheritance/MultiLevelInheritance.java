package com.javapractice.oops.inheritance;


class Puppy extends com.javapractice.oops.inheritance.Dog {
    void weep(){
        System.out.println("Puppy weeps.");
    }
}

public class MultiLevelInheritance {

    public static void main(String[] args) {
        Puppy puppy = new Puppy();
       puppy.weep();
       puppy.bark();
       puppy.eat();
    }


}
