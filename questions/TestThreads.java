// Write java programs to create user defined threads by extending thread class and by implementation runnable.
package questions;

class ThreadDemo extends Thread {
    private Thread t;
    private  String threadName;

    public ThreadDemo(String name) {
        this.threadName = name;
        System.out.println("Creating" + threadName);
    }

    public void run() {
        System.out.println("Running" + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println( threadName +" "+ i);
                sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println( threadName + "Interupted");
        }

        System.out.println( threadName + " exiting");
    }
    public void start(){
        System.out.println("Starting"+threadName);
        if(t == null){
            t = new Thread(this.threadName);
            // t.start();
        }
    }
}

public class TestThreads {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo("Thread 1");
        t1.start();
        t1.run();
        System.out.println();
        
        ThreadDemo t2 = new ThreadDemo("Thread 2");
        t2.start();
        t2.run();
    }
}
