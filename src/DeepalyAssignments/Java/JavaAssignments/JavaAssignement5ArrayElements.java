/**
 * Topic :Arrays
 * Java Assignment no 5 :
 * 1. Calculate the Average of Array Elements
 * Problem:
 * Write a Java program to calculate the average value of elements in an integer array.​
 * Example:
 * Given the array: [10, 20, 30, 40, 50]​
 * Expected Output:
 * Average value of the array elements is: 30.0​
 * Hint:
 * Sum all elements of the array.
 * Divide the sum by the number of elements.​
 */
package DeepalyAssignments.Java.JavaAssignments;
public class JavaAssignement5ArrayElements {
    public static void main(String[] args) {
        //declare and assign values to array
       int[] arr = {10, 20, 30, 40, 50};

       //declare and assign value 0
       int sum =0;

       //Loop to iterate through the array elements
       for(int i = 0; i<=arr.length-1;i++){
           sum= sum + arr[i];
       }
        //print the outcome
        System.out.println("Average value of the array elements is : " + sum/arr.length);
    }

}
