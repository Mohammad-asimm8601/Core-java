/*Write a java program that demonstrates the use of increment(++), decrement(--), and modulus(%) operators. print the results. 
 output:
 original value: 10
 After increment: 11
 After decrement: 10
 Reminder: 1
*/
package basics;

public class Operators {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Original Value: "+num);
        System.out.println("After Increment: "+(++num));
        System.out.println("After Decrement: "+(--num));
        System.out.println("Reminder: "+(num%3));

    }
}
