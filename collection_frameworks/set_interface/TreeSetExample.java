package set_interface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        // ✅ TreeSet Basics:
        // - Implements Set & NavigableSet interface
        // - No duplicate elements allowed
        // - Sorted order (natural ordering)
        // - Does NOT allow null
        // - Backed by a Red-Black tree
        // - Not synchronized (thread-unsafe)

        // 1️⃣ Constructors
        Set<Integer> ts1 = new TreeSet<>();         // Default constructor
        Set<Integer> ts2 = new TreeSet<>(ts1);      // From existing collection

        // 2️⃣ Adding elements
        ts1.add(50);
        ts1.add(20);
        ts1.add(40);
        ts1.add(10);
        ts1.add(30);
        System.out.println("TreeSet ts1 (sorted): " + ts1);

        // 3️⃣ Common methods
        System.out.println("Contains 40? " + ts1.contains(40));
        ts1.remove(20);          // remove element
        System.out.println("After remove 20: " + ts1);
        System.out.println("Size of ts1: " + ts1.size());

        // 4️⃣ Iterating elements
        System.out.println("Iterating TreeSet elements:");
        for (Integer e : ts1) {
            System.out.println(e);
        }
    }
}
