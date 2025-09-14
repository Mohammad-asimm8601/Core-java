package loops;

import java.util.Scanner;

public class EvenNumber {
    // Print all odd numbers from 1 to n.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();

            for(int i=2; i<=num; i+=2){
                 System.out.print(i+" ");
            }
        }
    }
}
