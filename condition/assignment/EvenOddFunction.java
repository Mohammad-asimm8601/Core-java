package condition.assignment;

import java.util.Scanner;

public class EvenOddFunction {
    // Write a program that takes an integer as input and prints "Even" if the number is Even and "Odd" if the number is odd.
    public String EvenOdd(int num){
        if (num%2 == 0)
            return "Even";
        else
            return "Odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        EvenOddFunction result = new EvenOddFunction();
        System.out.println(result.EvenOdd(num));
        sc.close();
    }
    
}