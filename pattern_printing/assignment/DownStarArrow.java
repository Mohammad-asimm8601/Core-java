package pattern_printing.assignment;

import java.util.Scanner;

public class DownStarArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2*n-i; j++) {
               if(j==i || j==2*n-i) System.out.print("*  ");
               else System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
