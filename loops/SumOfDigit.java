package loops;

import java.util.Scanner;

public class SumOfDigit {
    // WAR to print sum of digits of a given number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum += d;
            n /= 10;
        }
        System.out.println(sum);
    }
}
