package conditions;
import java.util.Scanner;

public class Simplecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        char op = sc.next().charAt(0);
        double b = sc.nextDouble();
        sc.close();

        // if (op == '+') System.out.println(a+b);
        // if (op == '-') System.out.println(a-b);
        // if (op == '*') System.out.println(a*b);
        // if (op == '/') System.out.println(a/b);

        switch (op) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default: System.out.println("Please enter valid Operator!");
                throw new AssertionError();
        }
    }
}
