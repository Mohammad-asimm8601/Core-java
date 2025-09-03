package oops;

/*  Encapsulation --> binding related variables and method inside a class,restricting direct access to data making variables private, and providing public methods for controlled access
*/
class Employee {
    // private instance variable
     private int salary;
     private int overtime;
     private int rate;

    // Constructor to initialize variables
    Employee(int salary, int overtime, int rate) {
        this.salary = salary;
        this.overtime = overtime;
        this.rate = rate;
    }

    // setter method
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setOvertime(int overtime){
        this.overtime = overtime;
    }
    public void setRate(int rate){
        this.rate = rate;
    }

    //getter method
    public int getSalary(){
        return salary;
    }
    public int getOvertime(){
        return overtime;
    }
    public int getRate(){
        return rate;
    }

    // method to calculate total wage
    public int getWage(){
        return salary + (overtime * rate);
    }

    
    
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee emp= new Employee(50000, 10, 500);
        System.out.println("Total wage: "+ emp.getWage());

        emp.setOvertime(12);
        emp.setRate(550);
        System.out.println("Updated total wage: "+emp.getWage());
    }
}
