package com.javapractice.variables;

public class InstanceAndStaticVariablesExample {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.display();
        student1.name="Soumya";
        student1.rollNo=123;
        student1.display();
        student1.schoolName="Saraswati Vidya Mandir";
        System.out.println("Schoo Name is"+ student1.schoolName);


        Student student2 = new Student();
        student2.name="Shiva";
        student2.rollNo=1432;
        student2.display();

        System.out.println("Schoo Name is"+ student2.schoolName);



    }
}
