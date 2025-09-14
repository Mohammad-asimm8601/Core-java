package condition;
import java.util.Scanner;

public class Grade {
    // Take input percentage of a student and print the grade according to marks.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the percentage: ");
            int perc = sc.nextInt();
            
            if(perc >=81)System.out.println("Grade 'A' ");
            else if(perc >=61)System.out.println("Grade 'B' ");
            else if(perc >=41)System.out.println("Grade 'C' ");
            else  System.out.println("Fail");
        }
    }
}
