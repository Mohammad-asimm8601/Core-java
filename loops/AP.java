package loops;

import java.util.Scanner;

public class AP {
    // Display this AP- 4,7,10,13,16
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter terms: ");
        int n = sc.nextInt();
        for (int i = 4; i <= 3*n+1; i+=3) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
