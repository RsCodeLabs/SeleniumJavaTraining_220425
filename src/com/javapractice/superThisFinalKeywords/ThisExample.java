package com.javapractice.superThisFinalKeywords;

class Student{
    int id;
    String name;


    Student(){
        this(123,"Ravi");
        System.out.println("Default Constructor Called!");
    }

    Student(int id, String name){
        System.out.println("Parameterized Constructor Called!");
        this.id=id;
        this.name=name;
    }

    void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
    }

    void show(){
        this.display();
    }

}





public class ThisExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
       // Student student = new Student(101, "Ravi");
    }


}
