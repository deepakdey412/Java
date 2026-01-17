package list_interface;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // ✅ Stack Basics:
        // - java.util package, JDK 1.0
        // - LIFO (Last In First Out)
        // - Synchronized (thread-safe)

        // 1️⃣ Constructors
        Stack<Integer> s1 = new Stack<>();            // Default constructor
        Stack<Integer> s2 = new Stack<>();            // No capacity constructor, capacity grows dynamically
        Stack<Integer> s3 = new Stack<>();            // Could copy from another stack if needed

        // 2️⃣ Adding elements
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("Stack s1: " + s1);

        // 3️⃣ Using methods
        System.out.println("Top element: " + s1.peek()); // view top
        System.out.println("Popped element: " + s1.pop()); // remove top
        s1.push(50);
        System.out.println("Stack after push 50: " + s1);

        System.out.println("Is stack empty? " + s1.isEmpty());
        System.out.println("Size of stack: " + s1.size());
    }
}
