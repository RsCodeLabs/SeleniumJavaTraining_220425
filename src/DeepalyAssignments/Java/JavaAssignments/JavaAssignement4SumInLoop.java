/***
 * Topic : Loops & Conditional Statements
 * Java Assignment no 4:
 * Find sum of 100  numbers (Clue : loop i till 100 using for loop , make sum += i and print sum)
 */
package DeepalyAssignments.Java.JavaAssignments;

public class JavaAssignement4SumInLoop {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum+=i;
//            System.out.println(" Sum of number " + i + " Sum : "+ sum );
        }
        System.out.println("Sum of 100 numbers : " + sum);
    }
}
