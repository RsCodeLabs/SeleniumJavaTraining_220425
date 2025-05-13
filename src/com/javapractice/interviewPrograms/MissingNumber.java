package com.javapractice.interviewPrograms;

public class MissingNumber {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,6};
        int missingNumber = 0;
        for(int no: numbers)
        {
            missingNumber = missingNumber^no;
            System.out.println("int no:numbers"+missingNumber);
        }
        for(int i=0; i<=6;i++)
        {
            missingNumber = missingNumber^i;
            System.out.println("i=0; i<=6;i++"+missingNumber);
        }
        System.out.println("imissingNumber"+missingNumber);
    }
}
