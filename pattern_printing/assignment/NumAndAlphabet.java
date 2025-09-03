package pattern_printing.assignment;

import java.util.Scanner;

public class NumAndAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1)
                    System.out.print(j + " ");
                else
                    System.out.print((char) (64 + j)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
