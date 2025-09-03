package loops.assignment;

import java.util.Scanner;

public class NaturalNumber {
    // Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the natural number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) 
            sum +=i;
        System.out.println(sum);
        sc.close();
    }
}
