package list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        // ✅ ArrayList Basics:
        // - Part of java.util package, available since JDK 1.2
        // - Maintains insertion order
        // - Internally uses a resizable array (dynamic array)
        // - Default initial capacity = 10
        // - Formula for growth: newCapacity = (oldCapacity * 3 / 2) + 1
        // - Not synchronized (not thread-safe)

        // 1️⃣ Creating ArrayLists (without generics)
        List list = new ArrayList();    // List interface reference
        ArrayList al = new ArrayList(); // ArrayList reference

        // 2️⃣ Adding elements using add()
        al.add(10);  // Integer (autoboxing)
        al.add(20);
        al.add(30);
        al.add(10);  // duplicates allowed
        System.out.println("ArrayList without generics: " + al);

        // 3 Constructors
        ArrayList<Integer> al1 = new ArrayList<>();           // Default constructor
        ArrayList<Integer> al2 = new ArrayList<>(20);         // With initial capacity
        ArrayList<Integer> al3 = new ArrayList<>(al1);        // From existing ArrayList

        // 4️⃣ Common ArrayList Methods

        // add(index, element) -> insert at specific position
        al2.add(0, 100);
        al2.add(1, 200);
        System.out.println("al2 after add at index: " + al2);

        // addAll(Collection) -> add all elements from another collection
        al2.addAll(al);
        System.out.println("al2 after addAll(al): " + al2);

        // get(index) -> get element at index
        System.out.println("Element at index 2 in al2: " + al2.get(2));

        // set(index, element) -> update element at index
        al2.set(0, 999);
        System.out.println("al2 after set: " + al2);

        // remove(index) -> remove element at index
        al2.remove(1);
        System.out.println("al2 after remove index 1: " + al2);

        // remove(Object) -> remove first occurrence of object
        al2.remove((Integer) 10);
        System.out.println("al2 after remove element 10: " + al2);

        // size() -> number of elements
        System.out.println("Size of al2: " + al2.size());

        // contains(Object) -> check if element exists
        System.out.println("Does al2 contain 999? " + al2.contains(999));

        // isEmpty() -> check if ArrayList is empty
        System.out.println("Is al3 empty? " + al3.isEmpty());

        // clear() -> remove all elements
        al3.add(1);
        al3.add(2);
        System.out.println("al3 before clear: " + al3);
        al3.clear();
        System.out.println("al3 after clear: " + al3);

        // 5️⃣ Iterating ArrayList
        System.out.println("Iterating over al2 using for-each:");
        for (Object element : al2) {
            System.out.println(element);
        }

        System.out.println("Iterating over al using for loop (index):");
        for (int i = 0; i < al.size(); i++) {
            System.out.println("al[" + i + "] = " + al.get(i));
        }

        // 6️⃣ Notes:
        // - ArrayList allows duplicates
        // - Maintains insertion order
        // - Can contain null
        // - Thread-unsafe (use Collections.synchronizedList() for thread safety)
    }
}
