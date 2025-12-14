package Thread;

class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    @Override
    public void run(){
        // int i = 98;
        System.out.println("Thank you!");
        // while(true){
        //     System.out.println("I am a thread");
        // }
    }
}
public class Threadconstructor {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("Asim");
        Mythr t2 = new Mythr("Shabaz");
        t1.start();
        t2.start();
        System.out.println("the id of the thread t1 is : "+ t1.getId());
        System.out.println("the name of the thread t1 is : "+ t1.getName());
        System.out.println("the id of the thread t1 is : "+ t2.getId());
        System.out.println("the name of the thread t1 is : "+ t2.getName());
    }
}
