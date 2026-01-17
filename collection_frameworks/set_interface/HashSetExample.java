package set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        // ✅ HashSet Basics:
        // - Implements Set interface
        // - No duplicate elements allowed
        // - No guaranteed order of elements
        // - Allows one null element
        // - Not synchronized (thread-unsafe)
        // - Backed by a hash table

        // 1️⃣ Constructors
        Set<Integer> hs1 = new HashSet<>();         // Default constructor
        Set<Integer> hs2 = new HashSet<>(20);       // With initial capacity
        Set<Integer> hs3 = new HashSet<>(hs1);      // From existing collection

        // 2️⃣ Adding elements
        hs1.add(10);
        hs1.add(20);
        hs1.add(30);
        hs1.add(20);  // duplicate, will be ignored
        hs1.add(null); // null allowed
        System.out.println("HashSet hs1: " + hs1);

        // 3️⃣ Common methods
        System.out.println("Contains 20? " + hs1.contains(20));
        hs1.remove(10);          // remove element
        System.out.println("After remove 10: " + hs1);
        System.out.println("Size of hs1: " + hs1.size());

        // 4️⃣ Iterating elements
        System.out.println("Iterating HashSet elements:");
        for (Integer e : hs1) {
            System.out.println(e);
        }
    }
}
