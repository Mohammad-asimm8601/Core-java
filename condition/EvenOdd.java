package condition;
import java.util.Scanner;

public class EvenOdd {
    public String checkEvenOdd(int num){
        if(num%2 == 0){
            return "Even";
        }
        else{
            return "Odd";
        }

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            EvenOdd checker = new EvenOdd();
            System.out.println(n+" is "+checker.checkEvenOdd(n));
        }
        
    }
}
