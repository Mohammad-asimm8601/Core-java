package condition.assignment;

import java.util.Scanner;

public class AbsoluteValue {
    // Create a java method to find and print the absolute value of an integer without using the built-in Math.abs()function.
    public int absolute(int num){
        if (num < 0)
            return -num;
        else 
            return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        AbsoluteValue value = new AbsoluteValue();
        System.out.println(value.absolute(num));
        sc.close();
    }
}
