package primitives;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        // 1. byte
        // Size: 1 byte (8 bits)
        // Range: -128 to 127
        // Use: memory saving, small numbers
        byte b = 100;

        // 2. short
        // Size: 2 bytes (16 bits)
        // Range: -32,768 to 32,767
        // Use: numbers larger than byte but small range
        short s = 20000;

        // 3. int
        // Size: 4 bytes (32 bits)
        // Range: -2^31 to 2^31-1
        // Use: default integer type
        int i = 100000;

        // 4. long
        // Size: 8 bytes (64 bits)
        // Range: -2^63 to 2^63-1
        // Use: very large numbers
        long l = 123456789L;   // L is mandatory

        // 5. float
        // Size: 4 bytes (32 bits)
        // Precision: ~7 decimal digits
        // Use: decimal values (less precision)
        float f = 10.5f;       // f is mandatory

        // 6. double
        // Size: 8 bytes (64 bits)
        // Precision: ~15 decimal digits
        // Use: default decimal type
        double d = 99.99;

        // 7. char
        // Size: 2 bytes (16 bits)
        // Range: 0 to 65,535 (Unicode)
        // Use: single character
        char c = 'A';

        // 8. boolean
        // Size: JVM dependent (logical)
        // Values: true or false
        // Use: conditions
        boolean isJavaFun = true;

        // Printing all values
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + isJavaFun);
    }
}
