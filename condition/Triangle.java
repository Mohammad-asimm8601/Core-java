package condition;
import java.util.Scanner;

public class Triangle {
    // Take three numbers input and tell if they can be the sides of  a triangle.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the side a: ");
            double a = sc.nextDouble();
            System.out.print("Enter the side b: ");
            double b = sc.nextDouble();
            System.out.print("Enter the side c: ");
            double c = sc.nextDouble();
            
            System.out.println((a+b > c && a+c >b && b+c > a)? "Valid Triangle!" : "Not valid triangle!");
        }
    }
}
