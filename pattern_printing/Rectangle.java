package pattern_printing;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter number of cols:");
        int cols = sc.nextInt();
        for (int i = 1; i <= rows; i++) {   //rows
            for (int j = 1; j <= cols; j++) {  //cols
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
