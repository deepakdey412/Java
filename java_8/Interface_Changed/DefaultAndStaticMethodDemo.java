// * Demonstration of interface abstract, default, and static methods in Java.

/* ================= INTERFACE 1 ================= */
interface MyInterface01 {

    // Abstract method.
    // Every implementing class MUST provide an implementation.
    void m1();

    // Default method.
    // Has a body inside the interface.
    // Implementing classes are NOT required to override it.
    // It is called using the object of the implementing class.
    default void m2() {
        System.out.println("Default method from MyInterface");
    }
}

/* ================= INTERFACE 2 ================= */
interface MyInterfaceTwo {

    // Static method inside interface.
    // Cannot be called using class objects.
    // Must be called using the interface name.
    static void m2() {
        System.out.println("Static method from MyInterfaceTwo");
    }
}

/* ================= IMPLEMENTATION CLASS ================= */
class Test02 implements MyInterface01 {

    // Mandatory implementation of abstract method
    @Override
    public void m1() {
        System.out.println("m1() implemented in Test02 class");
    }

    // m2() is not overridden,
    // so the default method from interface will run.
}

/* ================= MAIN CLASS ================= */
public class DefaultAndStaticMethodDemo implements MyInterface01 {

    @Override
    public void m1() {
        System.out.println("m1() implemented in Main class");
    }

    public static void main(String[] args) {

        // Object of main class
        DefaultAndStaticMethodDemo obj1 = new DefaultAndStaticMethodDemo();
        obj1.m1();  // Calls overridden method
        obj1.m2();  // Calls default interface method

        System.out.println();

        // Object of Test02 class
        Test02 obj2 = new Test02();
        obj2.m1();  // Calls overridden method
        obj2.m2();  // Calls default interface method

        System.out.println();

        // Calling static method from interface
        MyInterfaceTwo.m2();
    }
}
