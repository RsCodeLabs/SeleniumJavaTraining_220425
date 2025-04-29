package com.javapractice.variables;

public class Teacher {
    // Instance variables
    String name;
    String subject;
    int experience;

    public static void main(String[] args) {
        // Creating three Teacher objects
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        Teacher teacher3 = new Teacher();

        // Assigning values to each teacher
        teacher1.name = "Mr. Sharma";
        teacher1.subject = "Math";
        teacher1.experience = 10;

        teacher2.name = "Ms. Latha";
        teacher2.subject = "English";
        teacher2.experience = 8;

        teacher3.name = "Mrs. John";
        teacher3.subject = "Science";
        teacher3.experience = 12;

        // Printing the details of each teacher
        System.out.println("Name: " + teacher1.name + ", Subject: " + teacher1.subject + ", Experience: " + teacher1.experience + " years");
        System.out.println("Name: " + teacher2.name + ", Subject: " + teacher2.subject + ", Experience: " + teacher2.experience + " years");
        System.out.println("Name: " + teacher3.name + ", Subject: " + teacher3.subject + ", Experience: " + teacher3.experience + " years");
    }
}
