package condition;
import java.util.Scanner;

public class GreatestNum {
    // Take three input from user and tell greatest number.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number a, b and c: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a>b && a>c) System.out.println(a+" is Greater");
            else if (b>a && b>c) System.out.println(b+" is Greater");
            else  System.out.println(c+" is Greater");
        }
    }
}
