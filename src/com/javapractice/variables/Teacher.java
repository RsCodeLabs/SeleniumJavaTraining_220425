package com.javapractice.variables;

public class Teacher {
        String name;
        String subject;
        int experience;

    public void main(String[] args) {
        Teacher Teacher1 = new Teacher();
        Teacher1.name = "Mr Sharma";
        Teacher1.subject = "Math";
        Teacher1.experience = 10;

        Teacher Teacher2 = new Teacher();
        Teacher2.name = "Mrs Latha";
        Teacher2.subject = "English";
        Teacher2.experience = 8;
        System.out.println("Name: "+Teacher1.name);
        System.out.println("Subject: "+Teacher1.subject);
        System.out.println("Experience: "+Teacher1.experience);

        System.out.println("Name: "+Teacher2.name);
        System.out.println("Subject: "+Teacher2.subject);
        System.out.println("Experience: "+Teacher2.experience);
    }

}

