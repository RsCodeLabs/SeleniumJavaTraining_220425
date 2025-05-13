package com.javapractice.interviewPrograms;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1,3,4,6,4,3,2,1};
        int largestValue = Integer.MIN_VALUE;
        int secondlargestValue = Integer.MIN_VALUE;

//        int largestValue = arr[0], secondlargestValue=arr[1];

        for(int eachNumber:arr)
        {
           if( eachNumber > largestValue)
           {
               secondlargestValue = largestValue;
               largestValue = eachNumber;
               System.out.println("largestValue: "+largestValue);
           } else if (eachNumber !=largestValue && eachNumber>secondlargestValue) {
               secondlargestValue = eachNumber;
               System.out.println("secondlargestValue: "+secondlargestValue);

           }
            System.out.println("largestValue:  "+largestValue);
            System.out.println("secondlargestValue:  "+secondlargestValue);
        }





      /*
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

*/
    }
}
