// Given two numbers a and b, write a method to print all odd numbers between them.
package methods.assignment;

public class OddNum {
    
    public void odd(int a, int b){
        for (int i = a+1; i < b; i++) {
            if(i%2 == 1) System.out.print(i+" ");
        }    
    }
    public static void main(String[] args) {
        OddNum num = new OddNum();
        num.odd(10, 20);
    }
}
