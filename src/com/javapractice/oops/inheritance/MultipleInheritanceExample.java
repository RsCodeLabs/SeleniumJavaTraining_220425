package com.javapractice.oops.inheritance;

class Father {
    void display() {
        System.out.println("Father class method");
    }
}

class Mother {
    void display() {
        System.out.println("Mother class method");
    }
}

/* class Child extends Father, Mother {
    void show(){
        System.out.println("Child class method");
    }// This will cause a compilation error
 }*/

public class MultipleInheritanceExample {
  /*  Child c = new Child();
    c.show(); // This will cause a compilation error
    c.display(); // This will cause a compilation error
   // This will cause a compilation error
    */
}
