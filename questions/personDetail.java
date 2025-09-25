// Write a program that describes a class person. It should have instance variables to record name, age and salary. Create a person object. Set and display its instance variables.
package questions;

class person {
    String name;
    int age;
    Double salary;

    public person(String name, int age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void disp(){
        System.out.println("Name is   :: "+name);
        System.out.println("Age is    :: "+age);
        System.out.println("Salary is :: "+salary);
    }
}

public class personDetail{
    public static void main(String[] args) {
        person p = new person("Mohammad Asim", 21, 35000.0);
        p.disp();
    }
}





