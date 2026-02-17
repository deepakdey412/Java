package Deinition_Of_Thread.By_Extending_Thread_Class;

// this class is called the definition of the thread
class MyThread extends Thread {
    public void run() { //This loop is called Job of Thread executed by the child thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        MyThread myThread = new MyThread(); // This is called the thread initialization

        myThread.start();// create the new thread and execute the job in it.
//        myThread.run(); // this is execute the job of class as a normal method.

        for (int i = 1; i <= 10; i++) { // this job is excuted by the main thread
            System.out.println("Main Thread");
        }

    }
}


//Note :
// 1. Thread schedular
// 2. Difference between .start() and .run()