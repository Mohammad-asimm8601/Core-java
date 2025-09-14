package condition.assignment;

import java.util.Scanner;

public class CostPriceAndSellingPrice {
    // design a java program that calculates and prints whether a transaction results in a profit, loss, or break-even based on the cost price and selling price.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter cost price: ");
            double cp = sc.nextDouble();
            System.out.print("Enter selling price: ");
            double sp = sc.nextDouble();

            if(cp < sp){
                System.out.println("Profit");
                System.out.println("The total profit is: "+(sp-cp));
            }
            else if (sp < cp) {
                System.out.println("Loss");
                System.out.println("The loss is: "+(cp-sp));
            }
        } 
    } 
}
