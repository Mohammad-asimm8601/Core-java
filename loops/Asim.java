package loops;

import java.util.Scanner;

public class Asim {
    // Print any noun 'n' times. Take 'n' as input from user.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            for(int i=1; i<=n; i++){
                System.out.println("Mohammad Asim");
            }
        }
    }
}
