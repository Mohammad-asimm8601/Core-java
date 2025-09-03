package basics;
import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Area of circle
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: "+(Math.PI*radius*radius));

        // Simple Interest
        System.out.print("Enter Principle amount: ");
        double principle = sc.nextDouble();
        System.out.print("Enter Principle amount: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Principle amount: ");
        double time = sc.nextDouble();
        System.out.println("Simple Interest: "+(principle*rate*time)/100);
        sc.close();
    }
}
