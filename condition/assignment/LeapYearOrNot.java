package condition.assignment;

import java.util.Scanner;

public class LeapYearOrNot {
    // Implement a Java function to determine if a given Year is a leap year or not. Print "Leap Year" if true, otherwise print "Not a leap Year.
    public String leapYear(int year){
        if (year%4==0 && year%100 != 0 || year%400 == 0){
            return "Leap Year";
        }
        else 
            return "Not a Leap Year";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        LeapYearOrNot checker = new LeapYearOrNot();
        String result = checker.leapYear(year);
        System.out.println(result);
        sc.close();
    
    }
}