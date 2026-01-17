public class WhileLoopExample {
    public static void main(String[] args) {
        System.out.println("While Loop Example:");

        // Use 'while' loop when:
        // ✅ You don't know the exact number of iterations in advance
        // ✅ Loop should continue based on a condition
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
