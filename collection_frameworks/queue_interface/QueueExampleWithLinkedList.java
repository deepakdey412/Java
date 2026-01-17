package queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampleWithLinkedList {
    public static void main(String[] args) {

        // ✅ Queue Basics:
        // - Queue is an interface in java.util
        // - FIFO (First In First Out)
        // - Common methods: add(), offer(), remove(), poll(), peek(), element()
        // - Can be implemented by LinkedList, PriorityQueue, ArrayDeque, etc.

        // 1️⃣ Using LinkedList to implement Queue
        Queue<Integer> queue1 = new LinkedList<>();   // Interface reference
        LinkedList<Integer> queue2 = new LinkedList<>(); // Class reference

        // 2️⃣ Adding elements
        queue1.add(10);  // throws exception if full
        queue1.add(20);
        queue1.add(30);
        queue1.offer(40); // returns false if cannot add
        System.out.println("Queue1 elements: " + queue1);

        // 3️⃣ Access elements
        System.out.println("Head of queue1 (peek): " + queue1.peek());   // returns head without removing
        System.out.println("Removed element (poll): " + queue1.poll());  // removes and returns head
        System.out.println("Queue1 after poll: " + queue1);

        // 4️⃣ Using LinkedList class reference
        queue2.addFirst(5);   // add at first
        queue2.addLast(50);   // add at last
        System.out.println("Queue2 elements: " + queue2);

        queue2.remove();      // removes first element
        System.out.println("Queue2 after remove(): " + queue2);
        System.out.println("Size of queue2: " + queue2.size());
    }
}
