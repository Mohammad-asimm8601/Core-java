package loops;

import java.util.Scanner;

public class GP {
    // Display this GP- 1,2,4,8,16,32,... upto 'n' terms.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter terms: ");
        int n = sc.nextInt();
        int a = 1;
        for (int i=1; i<=n; i++){
            System.out.print(a+" ");
            a *=2;
        }
        sc.close();
    }
}
