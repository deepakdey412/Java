public class DoWhileLoopExample {
    public static void main(String[] args) {
        System.out.println("Do-While Loop Example:");

        // Use 'do-while' loop when:
        // ✅ You want the loop body to run at least once
        // ✅ Condition should be checked after the first iteration
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
