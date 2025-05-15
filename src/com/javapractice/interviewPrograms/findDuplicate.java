
package com.javapractice.interviewPrograms;

import java.util.HashMap;

public class findDuplicate
{
    private static void intCount(int[] inputInt)
    {
        //Creating a HashMap containing char as a key and occurrences as a value
        HashMap<Integer, Integer> intCountMap = new HashMap<>();

        //Converting given string to char array
//        int[] strArray = inputInt.toCharArray();

        //checking each char of strArray
        for (int c : inputInt)
        {
            if(intCountMap.containsKey(c))
            {
                //If char 'c' is present in charCountMap, incrementing it's count by 1
                intCountMap.put(c, intCountMap.get(c)+1);
            }
            else
            {
                //If char 'c' is not present in charCountMap //putting 'c' into charCountMap with 1 as it's value
                intCountMap.put(c, 1);
            }
        }

        //Printing inputString and charCountMap
        System.out.println(inputInt+" : "+intCountMap);
    }

    public static void main(String[] args)
    {
        int[] inputArray = new int[] {111, 333, 555, 777, 333, 444, 555};
        intCount(inputArray);

    }


}