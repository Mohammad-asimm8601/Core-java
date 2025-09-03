package pattern_printing.assignment;

import java.util.Scanner;

public class PalindromeAlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = i-1; j >= 1; j--) {
                System.out.print((char)(65+j)+" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
