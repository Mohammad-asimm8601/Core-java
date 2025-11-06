package questions;

class InsufficientfundsException extends Exception{
    public double amount;

    public InsufficientfundsException(Double amount) {
        this.amount  = amount;
    }
    public double getAmount(){
        return amount;
    }  
}

class checkingAccount{
    private double balance;
    private final int number;

    public checkingAccount(int number) {
        this.number = number;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public double getBalance(){
        return balance;
    }

    public double getNumber(){
        return number;
    }

    public void withdraw(double amount) throws InsufficientfundsException{
        if(amount <= balance){
            balance -= amount;
        }else{
            double needs = amount - balance;
            throw new InsufficientfundsException(needs);
        }
    } 
}
public class BankDemo {
    public static void main(String[] args) {   
        checkingAccount a = new checkingAccount(101);
        System.out.println("Deposit 500");
        a.deposit(500);

        try {
            System.out.println("Withdraw 100");
            a.withdraw(100);
            System.out.println("Withdraw 600");
            a.withdraw(600);
        } catch (InsufficientfundsException e) {
            System.out.println("Sorry,Insuficient balance. You are shorted by: " +e.getAmount());
        }
    }
}
