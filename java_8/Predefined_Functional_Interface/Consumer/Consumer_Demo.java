package Consumer;

import java.util.function.Consumer;

public class Consumer_Demo {
    public static void main(String[] args) {

        Consumer<String> c = (name) -> System.out.println(name + " Hello");

        c.accept("Deepak");
    }
}
