package DeepalyAssignments.Java.JavaAssignments.OOPSbasics;

public class Assignment17FinalSuper {
    public static void main(String[] args) {

        //Creating an object from subclass
        Employee emp = new Employee();
        emp.display();

        //creating object from class
        Person person = new Person();
        person.display();

    }
}

class Person{
    final String country = "India";

    void display(){
        System.out.println("Person from India");
    }

}

class Employee extends Person{
    @Override
   void display(){
        super.display();
        System.out.println("Employee working in IT sector");
    }


}