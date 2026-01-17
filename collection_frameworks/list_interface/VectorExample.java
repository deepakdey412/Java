package list_interface;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        // ✅ Vector Basics:
        // - java.util package, JDK 1.0
        // - Synchronized (thread-safe)
        // - Maintains insertion order
        // - Default capacity = 10

        // 1️⃣ Constructors
        Vector<Integer> v1 = new Vector<>();             // Default constructor
        Vector<Integer> v2 = new Vector<>(30);           // With initial capacity
        Vector<Integer> v3 = new Vector<>(v1);           // From existing Vector

        // 2️⃣ Adding elements
        v1.add(10);
        v1.add(20);
        v1.add(30);
        System.out.println("Vector v1: " + v1);

        // 3️⃣ Using methods
        v1.add(1, 15);               // add at index
        v1.addAll(v1);               // add all elements
        v1.set(0, 100);               // update element
        v1.remove((Integer) 20);      // remove first occurrence
        System.out.println("After addAll, set & remove: " + v1);

        System.out.println("Size of v1: " + v1.size());
    }
}
