/***
 * Topic : Variable
 * Java Assignment2
 * Create a Teacher class with the following instance variables:
 * •	name (String)
 * •	subject (String)
 * •	experience (int)
 * Then:
 * 1.	Create three objects of the Teacher class.
 * 2.	Assign different values to each object.
 * 3.	Print the details of all three teachers.
 * ______________
 * ✅ Sample Output:
 * Name: Mr. Sharma, Subject: Math, Experience: 10 years
 * Name: Ms. Latha, Subject: English, Experience: 8 years
 */
package DeepalyAssignments.Java.JavaAssignments;
public class JavaAssignement2InstanceVariables {
    //Variable declaration
    String name, subject;
    int experience;
    
    public static void main(String[] args) {
        //Initialiazation of Objects
        JavaAssignement2InstanceVariables Teacher1 = new JavaAssignement2InstanceVariables();


        // Assigning values to the Instance Variables
        Teacher1.name = "Mr Sharma";
        Teacher1.subject = "Math";
        Teacher1.experience = 10;

        //Printing the assigned values
        System.out.println("Teacher's name : "+ Teacher1.name + ", Teacher's subject : "+ Teacher1.subject + ", Teacher's experience : " + Teacher1.experience);

        JavaAssignement2InstanceVariables Teacher2 = new JavaAssignement2InstanceVariables();
        Teacher2.name = "Mr Latha";
        Teacher2.subject = "English";
        Teacher2.experience = 8;
        System.out.println("Teacher's name : "+ Teacher2.name + ", Teacher's subject : "+ Teacher2.subject + ", Teacher's experience : " + Teacher2.experience);


    }
}
