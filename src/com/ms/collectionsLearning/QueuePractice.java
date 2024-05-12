package com.ms.collectionsLearning;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        System.out.println("size: "+queue.size());
        queue.offer(9);
        queue.add(5);
        queue.add(8);
        queue.add(2);
        queue.add(7);
        queue.add(0);
        System.out.println(queue);
        System.out.println("peek: "+queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);


        Queue<Integer> q1= new ArrayDeque<>();

        q1.offer(9);

        q1.add(5);
        q1.add(8);
        q1.add(2);
        q1.add(7);
        q1.add(0);

        System.out.println("\nArray Deque: "+q1);
        System.out.println(q1.peek());
        System.out.println(q1.poll());

    }
}
