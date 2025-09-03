package pattern_printing;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n:");
        // int n = sc.nextInt();

        // int a = 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(a++ +" ");
        //     }
        //     System.out.println();
        // }
        // sc.close();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows n: ");
        int n = sc.nextInt();

        int a = n*(n+1)/2;
        int current = a;

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print((current -i+j)+" ");
            }
            current -=i;
            System.out.println(current);
            System.out.println();      
        }
        sc.close();
    }
}

