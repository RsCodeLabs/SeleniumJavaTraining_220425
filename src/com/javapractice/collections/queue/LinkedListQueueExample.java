package com.javapractice.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        Queue<Integer> numberQueue = new LinkedList<>();

        // Adding elements to the queue
        numberQueue.add(10);
        numberQueue.add(20);
        numberQueue.add(50);
        numberQueue.add(30);
        numberQueue.add(40);
       //numberQueue.add(null); // Adding null is allowed in LinkedList

        System.out.println("Queue after adding elements: " + numberQueue);


        while(!numberQueue.isEmpty()){
            int number =   numberQueue.poll(); // removes the head of the queue
            System.out.println("Removed element: " + number);
            System.out.println("Queue after removing elements: " + numberQueue);
        }







    }
}