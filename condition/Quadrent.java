package condition;
import java.util.Scanner;

public class Quadrent {
    // Given a point (x,y), Write a program to find out if it lies in the 1st Quadrant, 2nd Quadrant, 3rd Quadrant, 4th quadrant, on the x-axis, Y-axis or at thr origin, ciz(0, 0)
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter x-axis: ");
            int x = sc.nextInt();
            System.out.print("Enter y-axis: ");
            int y = sc.nextInt();
            
            if(x > 0 && y >0)System.out.println("Ist Quadrant");
            else if(x < 0 && y >0)System.out.println("2nd Quadrant");
            else if(x < 0 && y <0)System.out.println("3rd Quadrant");
            else if(x > 0 && y <0)System.out.println("4th Quadrant");
            else if(x==0 && y==0)System.out.println("Point at Origin");
            else if(x == 0)System.out.println("On Y-axis");
            else if(y == 0)System.out.println("4th Quadrant");
            System.out.println("Lies at point ("+x+","+y+")");
        }
    }
}
