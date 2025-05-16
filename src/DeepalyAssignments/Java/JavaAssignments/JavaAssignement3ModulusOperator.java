/***
 * Topic : Loops & Conditional Statements
 * Java Assignment no 3 :
 * Print Even Numbers using Modulus Operator
 * ( Clue : n%2==0 is even, n%2==1 is odd
 */
package DeepalyAssignments.Java.JavaAssignments;
public class JavaAssignement3ModulusOperator {

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Even numbers from 1 to " +n +":");
        for(int i = 1; i <= 100; i++){
            if(i%2==0){
                System.out.println("Even number : " + i);
            }
        }

    }

}
