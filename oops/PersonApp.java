package oops;

// BaseClass or SuperClass or ParentClass 

class Person {
    // instance variable
    public String name;
    public String address;
    public int age;

}

// DerivedClass or ChildClass
class Student extends Person {
    public int marks;
    public String grade;

    // Constructor
    Student(String name, String address, int age, int marks, String grade) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }
    // Normal method
    public void disp() {
        System.out.println("Called during object creation...");
        System.out.println("Name     is :: " + name);
        System.out.println("Address  is :: " + address);
        System.out.println("Age      is :: " + age);
        System.out.println("Marks    is :: " + marks);
        System.out.println("Grade    is :: " + grade);
    }
}

public class PersonApp {
    public static void main(String[] args) {
        Student st = new Student("Mohammad Asim", "Siddharth nagar, Uttar Pradesh India", 21, 30, "A");
        st.disp();
    }
}
