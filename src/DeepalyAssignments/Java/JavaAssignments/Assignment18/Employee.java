package DeepalyAssignments.Java.JavaAssignments.Assignment18;

public class Employee extends Person {

    public static void main(String[] args) {
        Person person = new Person();
        //Can not access private field.  Error 'name' has private access
//        System.out.println("" + person.name);
        person.setName("Deepaly");
        System.out.println("getter for private access modifier " + person.getName());

        //protected  Accessible in the same package and subclasses (even in different packages).
        System.out.println("protected access modifier : " + person.age);

        //Default  Accessible only within the same package.
        System.out.println("Default access modifier : " + person.city);

        //Public  Accessible only within the same package.
        System.out.println("Public access modifier : " + person.country);

    }
}