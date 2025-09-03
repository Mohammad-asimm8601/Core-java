package loops.assignment;

import java.util.Scanner;

public class Palindrome {
    // Write a java program to check if a given string is a palindrome or not using a loop.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();
        String org_str = str;

        String rev = "";
        int len = str.length();

        for (int i=len-1; i>=0; i--){
            rev += str.charAt(i);
        }

        if(org_str.equals(rev)){
            System.out.println(org_str+" is a Palindrome ");
        }
        else{
            System.out.println(org_str+" Not a palindrome ");
        }
        sc.close();
        
    }
}
