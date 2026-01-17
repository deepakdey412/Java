package set_interface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        // ✅ LinkedHashSet Basics:
        // - Implements Set interface
        // - Maintains insertion order
        // - No duplicate elements allowed
        // - Allows one null element
        // - Not synchronized (thread-unsafe)
        // - Internally uses a Hash table + linked list

        // 1️⃣ Constructors
        Set<Integer> lhs1 = new LinkedHashSet<>();         // Default constructor
        Set<Integer> lhs2 = new LinkedHashSet<>(20);       // Initial capacity + default load factor
        Set<Integer> lhs3 = new LinkedHashSet<>(lhs1);     // From existing collection

        // 2️⃣ Adding elements
        lhs1.add(10);
        lhs1.add(20);
        lhs1.add(30);
        lhs1.add(20);  // duplicate, ignored
        lhs1.add(null); // allows one null
        System.out.println("LinkedHashSet lhs1 (insertion order): " + lhs1);

        // 3️⃣ Common methods
        System.out.println("Contains 20? " + lhs1.contains(20));
        lhs1.remove(10);        // remove element
        System.out.println("After remove 10: " + lhs1);
        System.out.println("Size of lhs1: " + lhs1.size());

        // 4️⃣ Iterating elements
        System.out.println("Iterating LinkedHashSet elements:");
        for (Integer e : lhs1) {
            System.out.println(e);
        }
    }
}
