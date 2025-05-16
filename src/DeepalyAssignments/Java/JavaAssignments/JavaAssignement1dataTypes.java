/***
 * DataTypes:
 * Java Assignment1: Write a Java program that stores and displays the following student information using appropriate data types:
 * •	Name (String)
 * •	Roll Number (int)
 * •	Age (byte)
 * •	Grade (char)
 * •	Is Enrolled (boolean)
 * •	Fee Paid (float)
 * Sample Output:
 * Student Information:
 * Name       : Rahul Sharma
 * Roll No.   : 102
 * Age        : 18
 * Grade      : A
 * Enrolled?  : true
 * Fee Paid   : 15000.5
 */
package DeepalyAssignments.Java.JavaAssignments;
public class JavaAssignement1dataTypes {

    public static void main(String[] args) {

        //Declaration of variables
        String name = "Rahul Sharma";
        int rollNumber = 102;
        byte age = 18;
        char grade = 'A';
        boolean isEnrolled = true;
        float feePaid = 15000.5f;

        //Display student information
        System.out.println("Name : "+name);
        System.out.println("Roll No. : " +rollNumber);
        System.out.println("Age : " + age);
        System.out.println("Grade : " + grade);
        System.out.println("Enrolled ? : " + isEnrolled);
        System.out.println("Fee Paid : " + feePaid);

    }
}

