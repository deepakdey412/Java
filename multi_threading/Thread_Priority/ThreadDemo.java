package Thread_Priority;

class MyThread extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("child Thread");
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.setPriority(10);
        myThread.start();
//        Thread.currentThread().setPriority(10);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
