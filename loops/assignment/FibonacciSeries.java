package loops.assignment;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        int first = 0, second = 1;
        System.out.println("Fibonacci series upto "+num+ " terms: ");

        for (int i = 0; i <= num; i++) {
            System.out.println(first+ " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}