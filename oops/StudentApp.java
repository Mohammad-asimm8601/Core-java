package oops;

class Student {
    private int rollNo;
    private String name;
    private String address;

    // setter method
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    // getter method
    public int getRollNo(){
        return rollNo;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
}
public class StudentApp{
    public static void main(String[] args) {
        Student s1 = new Student();

        // Calling setter method
        s1.setRollNo(29);
        s1.setName("Mohammad Asim");
        s1.setAddress("Siddharth nagar, Uttar Pradesh");

        // Calling getter method
        System.out.println("RollNo  is :: "+s1.getRollNo());
        System.out.println("Name    is :: "+ s1.getName());
        System.out.println("Address is :: "+ s1.getAddress());
    }
}


