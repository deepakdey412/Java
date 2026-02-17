
// * Demonstration of a normal interface and why default methods are useful.

/* ================= INTERFACE ================= */
interface MyInterfaceOne {

    // Abstract methods.
    // Every implementing class MUST implement all abstract methods.
    void methodOne();
    void methodTwo();

    /*
     * Suppose we want to add another method, but we do NOT want every implementing class to implement it.
     *
     * Java 8 solved this problem using DEFAULT and STATIC methods.
     */

    // Default method (optional to override)
    default void methodThree() {
        System.out.println("Default implementation of methodThree");
    }
}

/* ================= IMPLEMENTATION CLASS: Test ================= */
class Test implements MyInterfaceOne {

    // Must implement abstract methods
    @Override
    public void methodOne() {
        System.out.println("Test methodOne");
    }

    @Override
    public void methodTwo() {
        System.out.println("Test methodTwo");
    }

    // methodThree() is NOT overridden,
    // so default implementation will be used.
}

/* ================= MAIN CLASS ================= */
public class InterfaceProblemDemo implements MyInterfaceOne {

    @Override
    public void methodOne() {
        System.out.println("Call abstract methodOne");
    }

    @Override
    public void methodTwo() {
        System.out.println("Call abstract methodTwo");
    }

    // Only this class overrides methodThree()
    @Override
    public void methodThree() {
        System.out.println("Custom implementation of methodThree in Demo");
    }

    public static void main(String[] args) {

        // Object of Demo class
        InterfaceProblemDemo demo = new InterfaceProblemDemo();
        demo.methodOne();
        demo.methodTwo();
        demo.methodThree(); // Call the overriden default method

        System.out.println();

        // Object of Test class
        Test test = new Test();
        test.methodOne();
        test.methodTwo();
        test.methodThree(); // uses default method
    }
}
