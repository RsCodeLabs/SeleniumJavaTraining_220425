package com.javapractice.typeCastingExample;

class Parent{
    void show(){
        System.out.println("Parent class");
    }
}

class Child extends Parent{

    Child(){
        super();
    }
    void display(){
        System.out.println("Child class");
    }


}


public class NonPrimitiveCastingExample {
    public static void main(String[] args) {
      try {
          int s = 10 ;
      }catch (ArithmeticException e){
            System.out.println("ArithmeticException: " + e.getMessage());
      }
        Parent p = new Child(); //Upcasting
        p.show();
      //  p.display(); // This will cause a compile-time error
        // To call the display method, we need to downcast
        Child c = (Child)  p; // Downcasting
        c.display();
        c.show();
    }

}
