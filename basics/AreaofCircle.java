package basics;
import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        double radius, area;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter radius: ");
            radius = sc.nextDouble();
            area = 3.14*radius*radius;
            System.out.println("The Area of Circle with radius "+radius+" is: "+area);
        }
    }
}
  