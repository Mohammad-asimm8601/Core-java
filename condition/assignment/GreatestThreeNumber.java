package condition.assignment;

import java.util.Scanner;

public class GreatestThreeNumber {
    // Write a java program to find nd print the greatest of three numbers entered by user.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if(a>b && a>c) System.out.println(a+" is greatest number");
        else if(b>c && b>c) System.out.println(b+" is greatest number");
        else if(c>a && c>b) System.out.println(c+" is greatest number");
    }
}
