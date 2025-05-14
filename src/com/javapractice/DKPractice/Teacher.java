package com.javapractice.DKPractice;

public class Teacher {
 //create instance variables
    String name;
    String subject;
    int experience;


    public static void main(String[] args) {
       //Creating 3 objects for the Teacher class
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        Teacher teacher3 = new Teacher();

        //Assigning values to variables
        teacher1.name = "Mr. Sharma";
        teacher1.subject = "Math";
        teacher1.experience = 10;

        teacher2.name = "Ms. Latha";
        teacher2.subject = "English";
        teacher2.experience = 8;

        teacher3.name = "Mr. Rakesh";
        teacher3.subject = "Hindi";
        teacher3.experience = 2;

        //Print the values
        System.out.println("Name is " + teacher1.name + ", Subject is " + teacher1.subject + ", Experience is " + teacher1.experience + " years");
        System.out.println("Name is " + teacher2.name + ", Subject is " + teacher2.subject + ", Experience is " + teacher2.experience + " years");
        System.out.println("Name is " + teacher3.name + ", Subject is " + teacher3.subject + ", Experience is " + teacher3.experience + " years");

    }
}
