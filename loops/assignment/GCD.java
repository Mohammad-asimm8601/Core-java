package loops.assignment;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int i = 0;
            while (num1 != num2) {
                if (num1 > num2) {
                    num1 -= num2;
                } else {
                    num2 -= num1;
                }
            }
            System.out.println(num1);
            System.out.println(i);
        }
    }
}
