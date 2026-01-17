import java.util.Arrays;

public class Arrays_Demo_1D {
    public static void main(String[] args) {

        // 1️⃣ Declaration: declare a 1D integer array
        int[] arr1;

        // 2️⃣ Initialization: create an array of size 10
        arr1 = new int[3];

        // 3️⃣ Assign values to specific indexes
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        // 4️⃣ Print each element using normal for loop (index-based)
        System.out.println("Printing array using normal for loop:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }

        // 5️⃣ Print each element using enhanced for loop (for-each)
        System.out.println("\nPrinting array using enhanced for loop:");
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");


        // 6️⃣ Print entire array at once using Arrays.toString()
        // This works because Arrays is a utility class in java.util package
        System.out.println("\nPrinting entire array using Arrays.toString():");
        System.out.println(Arrays.toString(arr1));
    }
}
