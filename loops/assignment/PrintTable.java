package loops.assignment;

import java.util.Scanner;

public class PrintTable {
    // Write a java Program to print a multiplication table for a given number 'n'
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num  = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(num+" x "+i+" = "+num*i);
                
            }
        }
    }
}
