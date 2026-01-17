package list_interface;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        // ✅ LinkedList Basics:
        // - java.util package, JDK 1.2
        // - Doubly linked list
        // - Maintains insertion order
        // - Not synchronized

        // 1️⃣ Constructors
        LinkedList<Integer> ll1 = new LinkedList<>();          // Default constructor
        LinkedList<Integer> ll2 = new LinkedList<>(ll1);       // From existing list

        // 2️⃣ Adding elements
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        System.out.println("LinkedList ll1: " + ll1);

        // 3️⃣ Using methods
        ll1.addFirst(5);       // add at first
        ll1.addLast(40);       // add at last
        ll1.set(0, 100);       // update element
        ll1.removeFirst();     // remove first
        ll1.removeLast();      // remove last
        System.out.println("After addFirst, addLast, set, removeFirst & removeLast: " + ll1);

        System.out.println("Size of ll1: " + ll1.size());
    }
}
