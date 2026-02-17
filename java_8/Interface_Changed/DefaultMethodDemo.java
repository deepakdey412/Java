
interface MyInterface{
    void m1();
    default void m2(){ // here we don't have the mendatory to implement this default method for every implemented class, and its body in written in the interface , to inivoke iwee nee d the oject of the class
        System.out.println("Default Method One");
    };
}
class Test01 implements MyInterface{
    @Override
    public void m1(){
        System.out.println("Default Method One in Test01 class ");
    }
}
public class DefaultMethodDemo implements MyInterface{
    @Override
    public void m1(){
        System.out.println("Default Method One in Main class ");
    }
    public static void main(String[] args) {

        DefaultMethodDemo defaultMethodDemo = new DefaultMethodDemo();
        defaultMethodDemo.m1();
        defaultMethodDemo.m2();

        Test01 test01 = new Test01();
        test01.m1();
        test01.m2();
    }
}
