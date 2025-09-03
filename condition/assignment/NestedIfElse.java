package condition.assignment;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c) System.out.println(a+" is greatest number");
            else System.out.println(c+" is greatest number");
        }
        else if(b>a){
            if(b>c)System.out.println(b+" is greatest number");
        }
        else System.out.println(c+" is greatest number");
    }
}
