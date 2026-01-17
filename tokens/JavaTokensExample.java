public class JavaTokensExample {  // 'public', 'class' = keywords; 'JavaTokensExample' = identifier

    public static void main(String[] args) { // 'main', 'String', 'args' = identifiers

        // 1️⃣ Keywords & Identifiers
        int a = 10;           // 'int' = keyword, 'a' = identifier, '10' = literal, '=' = operator, ';' = separator
        int b = 20;           // 'b' = identifier, '20' = literal
        int sum;              // 'sum' = identifier, declaration only

        // 2️⃣ Operators
        sum = a + b;           // '+' = operator, '=' = operator

        // 3️⃣ Literals
        System.out.println("Sum of a and b is: " + sum);
        // "Sum of a and b is: " = String literal
        // sum = variable (identifier)
        // + = concatenation operator

        // 4️⃣ Comments
        // This is a single-line comment

        /*
           This is a multi-line comment.
           Comments are ignored by compiler.
        */

        // 5️⃣ Separators / Punctuators
        // ; , { } ( ) [ ] -> used above in code as statement endings, blocks, parentheses, etc.

        // 6️⃣ Boolean & Comparison Operators
        boolean flag = true;  // 'boolean' = keyword, 'flag' = identifier, 'true' = literal
        if (a < b && flag) {  // '<' and '&&' are operators
            System.out.println("a is less than b and flag is true");
        }

        // 7️⃣ Final example of all token types
        char letter = 'A';      // 'char' = keyword, 'letter' = identifier, 'A' = literal
        double pi = 3.14;       // 'double' = keyword, 'pi' = identifier, 3.14 = literal
        final int MAX = 100;    // 'final' = keyword, 'MAX' = identifier, 100 = literal

        System.out.println("Letter: " + letter + ", Pi: " + pi + ", Max: " + MAX);
    }
}
