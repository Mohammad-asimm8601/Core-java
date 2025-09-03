/*Create a java program that performs arithmetic operations (addition, subtraction, multiplication, division) on integers ,floats, and doubles. print the results. 
 output:
 Integer Result: 15;
 Float Result: 12.3;
 Double Result: 24.5;
 Division Result: 5.0;
*/
package basics;

public class Primitive {
    public static void main(String[] args) {
        int int1 = 10, int2 = 5;
        int addition = int1 + int2;

        float float1 = 15.5f, float2 = 3.2f;
        float subtraction = float1 - float2;

        double double1 = 12.5, double2 = 2.0;
        double multiplication = double1 * double2;

        double division = multiplication/5;

        System.out.println("Integer Result: "+addition);
        System.out.println("Float Result: "+subtraction);
        System.out.println("Double Result: "+multiplication);
        System.out.println("Double Result: "+division);
    }
}
