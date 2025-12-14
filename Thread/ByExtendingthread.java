package Thread;

class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("My Thread1 is cooking");
            System.out.println("I am a happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("My Thread2 is chatting");
            System.out.println("I am a sad!");
            i++;
        }
    }
}

public class ByExtendingthread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
