package oops;

interface ICalculator{

    // public abstract
    void add (int a, int b);
    void sub (int a, int b);
}
interface IAdvanceCalculator extends ICalculator{

    // public abstract
    void mul (int a, int b);
    void div (int a, int b);
}

// Inheritance
// Implementation
class CalculatorImp implements IAdvanceCalculator{

    // ICalculator
    @Override
    public void add(int a, int b){
        System.out.println("The sum  is :: "+(a+b));
    }

    @Override
    public void sub(int a, int b){
        System.out.println("The sub  is :: "+(a-b));
    }
    public void mul(int a, int b){
        System.out.println("The sub  is :: "+(a*b));
    }
    public void div(int a, int b){
        System.out.println("The sub  is :: "+(a/b));
    }
    

}

public class Interface {
    public static void main(String[] args) {

        // loose coupling : polymorphism
        CalculatorImp cal = new CalculatorImp();
        cal.add(10, 20);
        cal.sub(100, 20);
        cal.mul(10, 20);
        cal.div(100, 20);
    }
}
 