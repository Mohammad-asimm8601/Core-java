package oops;

class Student{

    // instance variable
    String name;
    int age;

    // constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // instance method
    public void disp(){
        System.out.println("Name is :: "+name);
        System.out.println("Age  is :: "+age);
        System.out.println();
    }
    
}

public class InstanceVariable {
    public static void main(String[] args) {
        Student  s1 = new Student("Mohammad Asim", 21); 
        s1.disp();
        Student  s2 = new Student("Shabaz Alam", 20);
        s2.disp(); 
    }
}
