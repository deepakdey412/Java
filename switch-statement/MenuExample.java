import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add\n2. Subtract\n3. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You chose Add");
                    break;
                case 2:
                    System.out.println("You chose Subtract");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 3); // loop until user chooses to exit
    }
}
