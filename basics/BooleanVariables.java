/*Write a java program that uses boolean variables and relational operators to compare two numbers.Print whether the numbers are equals, not equals, greater, or less 
 output:
 Are numbers equal?false
Are numbers not equal?true
Is the first number greater?false
Is the first number less?true
*/
package basics;
public class BooleanVariables {
    public static void main(String[] args) {
        int a = 3, b = 10;
        System.out.println("Are numbers equal?"+(a == b));
        System.out.println("Are numbers not equal?"+(a != b));
        System.out.println("Is the first number greater?"+(a>b));
        System.out.println("Is the first number less?"+(a<b));
    }
}
