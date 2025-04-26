package com.pk.collections;

import java.util.PriorityQueue;

public class Test16_PrirityQueue {
	   
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
 
        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
 
        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());
        System.out.println(pQueue.peek());
        System.out.println(pQueue.peek());
 
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());
        System.out.println(pQueue);

        // Printing the top element again
        System.out.println(pQueue.peek());
        
   
    }
}