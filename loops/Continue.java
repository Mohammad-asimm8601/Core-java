package loops;

import java.util.Scanner;

public class Continue {
    // Display the odd number using loop between 1 t0 100
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i+=2) {
            if (i%2 == 0) continue;
            System.out.print(i+" ");
        }
        sc.close();
    }
}
