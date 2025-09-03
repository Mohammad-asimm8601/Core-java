package conditions;
/* Name of the class has to be "Main" only if the class is public. */

import java.util.Scanner;

 

class ProfitLossCalculator {

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

 

        // Take input for Selling Price and Cost Price

      

        double sellingPrice = scanner.nextDouble();

        

       

        double costPrice = scanner.nextDouble();

        

        // Determine profit, loss, or no profit/no loss

        if (sellingPrice > costPrice) {

            System.out.println("Profit");

        } else if (sellingPrice < costPrice) {

            System.out.println("Loss");

        } else {

            System.out.println("No Profit, No Loss");

        }

        

        scanner.close(); // Close the scanner

    }
}

