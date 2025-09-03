package conditions;
import java.util.Scanner;

public class Youngest {
    // If the ages of Ram, Shayam and  Ajay are input through the keyboard, write a program to determine the youngest of the three.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Ram: ");
        int ram  = sc.nextInt();
        System.out.print("Enter the age of Shyam: ");
        int shyam  = sc.nextInt();
        System.out.print("Enter the age of Ajay: ");
        int ajay  = sc.nextInt();

        if (ram > shyam){
            if(ram > ajay) System.out.println("Ram is Youngest");
            else System.out.println("Ajay is youngest");
        }
        else if(shyam > ram){
            if(shyam > ajay) System.out.println("Shayam is youngest");
            else System.out.println("Ajay is Youngest");
        }
        sc.close();
    }
}
