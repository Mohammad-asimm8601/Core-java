package condition;
import java.util.Scanner;

public class Simplecalculator {
    public static void main(String[] args) {
        double a;
        char op;
        double b;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextDouble();
            op = sc.next().charAt(0);
            b = sc.nextDouble();
        }

        // if (op == '+') System.out.println(a+b);
        // if (op == '-') System.out.println(a-b);
        // if (op == '*') System.out.println(a*b);
        // if (op == '/') System.out.println(a/b);

        switch (op) {
            case '+' -> System.out.println(a+b);
            case '-' -> System.out.println(a-b);
            case '*' -> System.out.println(a*b);
            case '/' -> System.out.println(a/b);
            default -> {
                System.out.println("Please enter valid Operator!");
                throw new AssertionError();
            }
        }
    }
}
