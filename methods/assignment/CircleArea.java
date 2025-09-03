// Write a method that takes the radius of a circle as an arguments and returns its area.
package methods.assignment;

public class CircleArea {
    public double area(double radius){
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        CircleArea cArea = new CircleArea();
        System.out.println(cArea.area(2));
    }
}
