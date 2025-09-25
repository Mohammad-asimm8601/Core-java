// Write a java program to demonstrate Method overloading.
package questions;

class Addition{
    public void add(int m, int n){
        System.out.println("The sum of int-int :: "+(m+n));
    }
    public void add(float m, float n){
        System.out.println("The sum of float-float :: "+(m+n));
    }
    public void add(double  m, double n){
        System.out.println("The sum of double-double :: "+(m+n));
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.add(10, 20);
        a.add(5.2f, 20);
        a.add(2.33, 3.14);
    }
}
