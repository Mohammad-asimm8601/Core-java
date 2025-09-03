package oops;
// Exposing the set of services but hiding the internal implementation
abstract class Person{
    String name;
    int age;
    float height;

    Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}

class Student extends Person{
    int marks;
    float avg;

    public Student(int marks, float avg, String name, int age, float height) {
        // To call parameterised constructor of of parent from child class
        super(name, age, height);
        this.marks = marks;
        this.avg = avg;
    }

    public void display(){
        System.out.println("Name   is :: "+name);
        System.out.println("Age    is :: "+age);
        System.out.println("Height is :: "+height);
        System.out.println("Marks  is :: "+marks);
        System.out.println("Avg    is :: "+avg);
    }
}
public class HidingTheInternalImplementation {
    public static void main(String[] args) {
        Student student = new Student(87, 53.4f, "Asim", 21, 5.3f);
        student.display();
    }
}
