package oops;

class Overloading{
    //  Overriding --> In a class, two are more method with same name but different arguments
    // Method Overriding
    public void add (int a, int b){
        System.out.println("int-int argument");
    }
    public void add (float  a, float b){
        System.out.println("float-float argument");
    }
    public void add (double  a, double  b){
        System.out.println("double-double argument");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Overloading rid = new Overloading();
        rid.add(10, 20);
        rid.add(10, 20.1f);
        rid.add(10.3, 20.1);
    }
}
