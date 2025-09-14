package condition;
import java.util.Scanner;

public class TernryOperator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            System.out.println((num%2 == 0) ? "Even" : "Odd");
        }
    }
}
