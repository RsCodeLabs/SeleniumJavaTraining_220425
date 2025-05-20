package DeepalyAssignments.Java.JavaAssignments.Assignment18AccessModifier;

import DeepalyAssignments.Java.JavaAssignments.Assignment18.Person;

public class Student extends Person {

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("Public access Modifier : " + person1.country);
        person1.setCity("Atlanta");
        System.out.println("setCity getCity" + person1.getCity());

        Student student = new Student();
        //To access create an object of the subclass since parent class object protected access modifier can’t be accessed
        System.out.println("protected access modifier can’t be accessed : " + student.age);

    }

}
