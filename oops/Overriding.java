package oops;

class Parent{
     public void property(){
        System.out.println("Land+Gold+Cash");
     }

     public void marry(){
        System.out.println("Relative Girl....");
     }
}

class Child extends Parent{
    // Overriding
    public void marry(){
        // Re-Implementation
        System.out.println("SomeOther Girl...");
    }
}

public class Overriding {
    public static void main(String[] args) {
        
        // Parent object
        Parent p1 = new Parent();
        p1.property();
        p1.marry();

        System.out.println();

        // Child object
        Child c1 = new Child();
        c1.property();
        c1.marry();

        System.out.println();

        // Child class
        Parent p2 = new Child();
        p2.property();
        p2.marry();
    }
}
