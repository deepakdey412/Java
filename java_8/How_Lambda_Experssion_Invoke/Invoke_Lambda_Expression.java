
@FunctionalInterface
interface MyFunctionalInterface{
    void methodOne();
}

public class Invoke_Lambda_Expression {

    public static void main(String[] args) {

        MyFunctionalInterface myFunctionalInterface = ()-> System.out.println("Lambda expression is invoked by functional interface");

        myFunctionalInterface.methodOne();
    }
}
