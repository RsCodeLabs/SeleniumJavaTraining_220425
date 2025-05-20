package DeepalyAssignments.Java.JavaAssignments.OOPSbasics;

import javax.xml.namespace.QName;

public class Assignment18AccessModifier {
    public static void main(String[] args) {

    }
}

class PersonA{
    private String name;
    protected int age;
    String city;
    public String country;

    void PersonA(){
        System.out.println("I am constructor");
    }

}

class EmployeeA extends PersonA{
//    super.name;
}