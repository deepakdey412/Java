import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number from 1 to 3
        System.out.println("Enter a number (1-3): ");
        int choice = sc.nextInt();

        // Switch statement starts here
        // ✅ switch is used to execute one block out of many based on a value
        switch (choice) {
            case 1:
                // If choice == 1, this block executes
                System.out.println("You selected Option 1: Hello!");
                break;  // break prevents the next cases from executing
            case 2:
                // If choice == 2, this block executes
                System.out.println("You selected Option 2: Welcome!");
                break;
            case 3:
                // If choice == 3, this block executes
                System.out.println("You selected Option 3: Goodbye!");
                break;
            default:
                // If none of the above cases match, this block executes
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        }

        sc.close(); // close the scanner
    }
}
