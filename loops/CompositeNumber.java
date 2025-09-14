package loops;

import java.util.Scanner;

public class CompositeNumber {
    // Write a program to check if a number is composite or not.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            int x = 0;
            for(int i=2; i<=n-1; i++){
                if (n%i == 0){
                    System.out.println("Composite number");
                    x = 1;
                    break;
                }
            }
            if (n == 1) System.out.println("Neither Prime nor Composite number");
            else if(x==0)System.out.println("Prime number");
        }
    }
}

