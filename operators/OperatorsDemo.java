public class OperatorsDemo {
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        // Used to perform basic calculations
        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));        // +
        System.out.println("Subtraction: " + (a - b));     // -
        System.out.println("Multiplication: " + (a * b)); // *
        System.out.println("Division: " + (a / b));        // /
        System.out.println("Modulus: " + (a % b));         // %

        // 2. Unary Operators
        // Work with a single operand
        int x = 5;

        System.out.println("Unary plus: " + (+x));         // +
        System.out.println("Unary minus: " + (-x));        // -
        System.out.println("Pre-increment: " + (++x));     // ++
        System.out.println("Post-increment: " + (x++));    // ++
        System.out.println("Post value: " + x);
        System.out.println("Pre-decrement: " + (--x));     // --
        System.out.println("Logical NOT: " + (!true));     // !

        // 3. Relational (Comparison) Operators
        // Used to compare two values
        // Result is always boolean
        int m = 10;
        int n = 20;

        System.out.println("m > n: " + (m > n));    // >
        System.out.println("m < n: " + (m < n));    // <
        System.out.println("m >= n: " + (m >= n));  // >=
        System.out.println("m <= n: " + (m <= n));  // <=
        System.out.println("m == n: " + (m == n));  // ==
        System.out.println("m != n: " + (m != n));  // !=

        // 4. Logical Operators
        // Used to combine multiple conditions
        boolean p = true;
        boolean q = false;

        System.out.println("p && q: " + (p && q));  // AND
        System.out.println("p || q: " + (p || q));  // OR
        System.out.println("!p: " + (!p));          // NOT

        // 5. Assignment Operators
        // Used to assign values
        int num = 10;

        num += 5;  // num = num + 5
        System.out.println("+= : " + num);

        num -= 3;  // num = num - 3
        System.out.println("-= : " + num);

        num *= 2;  // num = num * 2
        System.out.println("*= : " + num);

        num /= 4;  // num = num / 4
        System.out.println("/= : " + num);

        // 6. Bitwise Operators
        // Work at bit level
        int i = 5;  // 0101
        int j = 3;  // 0011

        System.out.println("i & j: " + (i & j));    // AND
        System.out.println("i | j: " + (i | j));    // OR
        System.out.println("i ^ j: " + (i ^ j));    // XOR
        System.out.println("~i: " + (~i));          // NOT
        System.out.println("i << 1: " + (i << 1));  // Left shift
        System.out.println("i >> 1: " + (i >> 1));  // Right shift

        // 7. Ternary Operator
        // Short form of if-else
        int age = 18;
        String result = (age >= 18) ? "Eligible to vote" : "Not eligible";
        System.out.println("Ternary result: " + result);

        // 8. instanceof Operator
        // Used to check object type
        String text = "Java";
        System.out.println("text instanceof String: " + (text instanceof String));
    }
}
