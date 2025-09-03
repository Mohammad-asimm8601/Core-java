package pattern_printing.assignment;

import java.util.Scanner;

public class DiamondPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){ 
            for(int j = 1; j <= 2*n; j++) {
                if(j==n+2-i|| j==n+1 || j==n+i)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 2*n+1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 2*n; j >= 1; j--) {
                if(j==i || j==n || j==2*n-i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
