package Deinition_Of_Thread.By_Extending_Runnable_Interface;

// this class is called the definition of the thread
class MyRunnable implements Runnable {
    public void run() { //This loop is called Job of Thread executed by the child thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        MyRunnable myRunnableObject = new MyRunnable(); // One Runnable object is ready

        Thread thread = new Thread(myRunnableObject); // Convert the runnable object into Thread

        thread.start();// create the new thread and execute the job in it.

        for (int i = 1; i <= 10; i++) { // this job is excuted by the main thread
            System.out.println("Main Thread");
        }

    }
}


//Note :
// 1. Thread schedular
// 2. Difference between .start() and .run()