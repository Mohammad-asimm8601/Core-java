package pattern_printing.assignment;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n)
                for (int j = 1; j <= 2 * n - n / 2; j++) {
                    System.out.print("* ");
                }
            else
                for (int j = 1; j <=n/2; j++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
        sc.close();
    }
}
