package com.javapractice.interviewPrograms;

public class SecondLargest {
    public static void main(String[] args) {
       int arr[] = {5,4,3,2,1};
       int firstLargest=0;
        int secLargest=0;

       for(int i =0;i<=arr.length-1;i++)
       {
//           System.out.println("arr[i]"+arr[i]);
           if(firstLargest<arr[i])
           {
               firstLargest = arr[i];
//               System.out.println("great number"+firstLargest);
           }
       }
        System.out.println("great number:  "+firstLargest);

        for(int i =0;i<=arr.length-1;i++)
        {
            if(firstLargest!=arr[i] && secLargest < firstLargest )
            {
                if(secLargest < arr[i]) {
                    secLargest = arr[i];
//                System.out.println("great number"+secLargest);
                }
            }
        }
        System.out.println("great second number:  "+secLargest);


    }
}
