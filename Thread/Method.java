package Thread;

class MyNewThr1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Thank you 1");
            try {
                Thread.sleep(340);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 8948) {
            System.out.println("Thank you 2");
            i++;
        }
    }
}

public class Method {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        // try {
        //     t1.join();
        // } catch (InterruptedException e) {
        //     System.out.println(e);
        // }
        t2.start();
    }
}
