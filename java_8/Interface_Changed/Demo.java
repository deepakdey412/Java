
// Normal interface implements all its methods in the implemented class
interface MyInterfaceOne{
    void methodOne();// this is the abstract method
    void methodTwo();
//    void methodThree(); now here is the problem, i want to inplement the m3 in Demo class but not in the Test class , but as per the interface rule in java , we need to implement all the methods in the interface in the implemented classes

    // to solve this problem, java 1.8 introduced the Default mehtod and static method
}

class Test implements MyInterfaceOne{
    @Override
    public void methodOne() {
        System.out.println("Test methodOne");
    }

    @Override
    public void methodTwo() {
        System.out.println("Test methodTwo");
    }
}
public class Demo implements MyInterfaceOne{

    @Override
    public void methodOne() {
        System.out.println("Call abstract methodOne");
    }

    @Override
    public void methodTwo() {
        System.out.println("Call abstract methodTwo");
    }

    public static void main(String[] args) {

        Demo demo = new Demo();
        demo.methodOne();
        demo.methodTwo();

        Test test = new Test();
        test.methodOne();
        test.methodTwo();

    }

}
