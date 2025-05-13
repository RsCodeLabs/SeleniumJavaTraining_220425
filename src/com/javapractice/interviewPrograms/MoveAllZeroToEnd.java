package com.javapractice.interviewPrograms;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {3,0,0,9,0,0,4,6,0};
        int nonZero_Number =0;
        int temp;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] != 0)
            {
                temp = arr[nonZero_Number];
                arr[nonZero_Number] = arr[i] ;
                arr[i] = temp;
                nonZero_Number++;
            }
        }
        for(int no:arr)
        {
            System.out.print(no+ " ");
        }

    }
}
