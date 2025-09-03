// Write a method to print squares of the first n natural numbers, taking n as an arguments to the method.
package methods.assignment;

public class PrintSquares {
    
    public void squares(int n){
        System.out.println(n*n);
    }

    public static void main(String[] args) {
        PrintSquares sq = new PrintSquares();
        sq.squares(5);
    }
}
