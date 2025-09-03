package pattern_printing;

import java.util.Scanner;

public class InverseRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i+1; j++) {
        //         System.out.print(n+1-i+" ");
        //     }
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n+1-i; j++){
                if((i+n)%2 != 0 ){
                    System.out.print((char)(j+64)+" ");
                }else{

                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
