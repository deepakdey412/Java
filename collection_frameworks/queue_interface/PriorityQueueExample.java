package queue_interface;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        // ✅ PriorityQueue Basics:
        // - Implements Queue interface
        // - Elements are ordered based on natural ordering or Comparator
        // - Does not allow null
        // - Not synchronized
        // - Default initial capacity = 11

        // 1️⃣ Constructors
        Queue<Integer> pq1 = new PriorityQueue<>(); // Default constructor
        Queue<Integer> pq2 = new PriorityQueue<>(20); // Initial capacity
        Queue<Integer> pq3 = new PriorityQueue<>(pq1); // From existing collection

        // 2️⃣ Adding elements
        pq1.add(50);
        pq1.add(20);
        pq1.add(40);
        pq1.add(10);
        System.out.println("PriorityQueue elements (natural order): " + pq1);

        // 3️⃣ Access elements
        System.out.println("Head of pq1 (peek): " + pq1.peek());  // returns smallest element
        System.out.println("Removed element (poll): " + pq1.poll()); // removes smallest
        System.out.println("PriorityQueue after poll: " + pq1);

        // 4️⃣ Common methods
        System.out.println("Contains 40? " + pq1.contains(40));
        System.out.println("Size of pq1: " + pq1.size());
    }
}
