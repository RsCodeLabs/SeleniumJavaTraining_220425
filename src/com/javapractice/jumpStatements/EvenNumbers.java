package com.javapractice.jumpStatements;

//Print even nos from 0 to 100
public class EvenNumbers {
    public static void main(String[] args) {
        for(int i=0; i<=1000; i++){
            if(i%2==1){
                continue;
            }
            System.out.println(i);
        }
    }

}
