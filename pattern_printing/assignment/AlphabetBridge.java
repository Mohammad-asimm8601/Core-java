package pattern_printing.assignment;

import java.util.Scanner;

public class AlphabetBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print((char)(64+i)+" ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print((char)(64+j)+" ");   
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("  ");   
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print((char)(68+j)+" ");   
            }
            System.out.println();
        }
        sc.close();
    }
}
