package conditions;
import java.util.Scanner;

public class AbsoluteValue {
    // Take integer input and print the absolute value of that integer.
    public int absolute(int num){
        return Math.abs(num);
        // if(num < 0){
        //     return -num;
        // }else{
        //     return num;
        // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        AbsoluteValue value = new AbsoluteValue();

        System.out.println("Absolute value: "+value.absolute(num));
    }

}


    