package oops;

class Employees{
    // Instance Variable
    String name;
    int age;

    // Zero arguments constructor
    Employees() {
        System.out.println("Employee constructor called");
    }

    // Instance Method
    public void disp(){
        System.out.println("Name is ::"+name);
        System.out.println("Age is ::"+age);
    }

    
}

public class ZeroArgumentsConstructor {
    public static void main(String[] args) {
        Employees asim = new Employees();
        asim.disp();
    }
}
