package condition;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        double principle, rate, time, SI;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Principle :");
            principle = sc.nextDouble();
            System.out.print("Enter rate :");
            rate = sc.nextDouble();
            System.out.print("Enter time :");
            time = sc.nextDouble();
            SI = (principle*rate*time)/100;
            System.out.println("The Simple interest is: "+SI);
        }

    }
}
