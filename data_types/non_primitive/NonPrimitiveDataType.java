package non_primitive;

public class NonPrimitiveDataType {
    public static void main(String[] args) {

        // String (Non-Primitive / Reference Data Type)
        // Size: Not fixed (depends on the content)
        // Stored in: Heap memory (String Constant Pool)
        // Use: To store a sequence of characters (text)
        // Default value: null
        // Immutable: Yes (cannot be changed once created)

        // 1. String using string literal
        // Stored in String Constant Pool
        String str1 = "Java";

        // 2. String using new keyword
        // Stored in Heap memory (outside String Pool)
        String str2 = new String("Spring Boot");

        // Printing strings
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Length of the string
        System.out.println("Length of str1: " + str1.length());

        // String concatenation
        String result = str1 + " Backend Developer";
        System.out.println("Concatenated String: " + result);

    }
}
