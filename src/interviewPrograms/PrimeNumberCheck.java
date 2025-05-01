package interviewPrograms;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println("Enter the 1number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("number is" + number);
        boolean isPrime = true;
        int sqrtCount = 0;
        int halfCount = 0;

        for(int i =2 ;i<=number;i++){
            halfCount++;
            if(number%2==0){
                System.out.println("Number is not Prime");
            }
            if(number%i==0){
                isPrime = false;
//
                break;
            }
            if( isPrime = true)
            {
                System.out.println("Number is Prime");
            }
            else {
                System.out.println("Number is not a Prime");
            }
        }

        if(number<=1){
            System.out.println("Number is not Prime");
        }
        for(int i =2 ;i<=number/2;i++){
            if(number%2==0){
                System.out.println("Number is not Prime");
            }
            if(number%i!=0){
                isPrime = true;
                halfCount++;
                System.out.println("Number is Prime");
                break;
            }

        }

        for(int i =2 ;i<=sqrt(number);i++){
            sqrtCount++;
            if(number%2==0){
                System.out.println("Number is not Prime");
            }
            if(number%i!=0){
                isPrime = true;
                System.out.println("Number is Prime");
                break;
            }

        }
        System.out.println("Number is Prime"+halfCount);
        System.out.println("Number is Prime"+sqrtCount);

        }
//        scanner.close();

    }

