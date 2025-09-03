package loops;

public class CountDigit {
    // WAP tp count digits of a given number 
    public static void main(String[] args) {
        int n = 44334;
        int i = 0;
        while(n != 0){
            n /= 10;
            i +=1;
        }
        System.out.println(i);

    }
}
