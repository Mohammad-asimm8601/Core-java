package conditions;
import java.util.Scanner;

public class AndOperator {
    // Take input number and tell it is three digit number or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three digit number:" );
        int num = sc.nextInt();
        sc.close();
        if(num > 99 && num < 1000){
            System.out.println("The entered number is Three digit number.");
        }else{
            System.out.println("The entered number is not three digit number.");
        }
    }
}
