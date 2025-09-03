// Write a method to count the digits in a number and then print the square of this number.
package methods.assignment;

public class CountDigits {

    public void countAndSquare(int num) {
        int n = num;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            num /= 10;
            count += 1;
        }
        System.out.println("Digit  :: "+count);
        System.out.println("Square :: "+n*n);
    }

    public static void main(String[] args) {
        CountDigits cd = new CountDigits();
        cd.countAndSquare(5);
    }
}
