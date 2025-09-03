package condition.assignment;

import java.util.Scanner;

public class NameTriangle {
    // Create a java function that takes three integer parameters representing the
    // side of triangle and print whether it's equilateral, isosceles, or scalene.

    public String triangle(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c)
                return "Equilateral";
            else if (a == b || a == c || b == c)
                return "Isosceles";
            else
                return "Scalene";
        } else
            return "Not a Triangle!";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int a = sc.nextInt();
        System.out.print("Enter second side: ");
        int b = sc.nextInt();
        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        NameTriangle checker = new NameTriangle();
        System.out.println(checker.triangle(a, b, c));
        sc.close();
    }
}
