package com.javapractice.collections.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> numberQueue = new PriorityQueue<>();

        // Adding elements to the queue
        numberQueue.add(10);
        numberQueue.add(20);
        numberQueue.add(50);
        numberQueue.add(30);
        numberQueue.add(40);

        System.out.println("Queue after adding elements: " + numberQueue);


        while(!numberQueue.isEmpty()){
            int number =   numberQueue.poll(); // removes the head of the queue
            System.out.println("Removed element: " + number);
            System.out.println("Queue after removing elements: " + numberQueue);
        }








    }
}