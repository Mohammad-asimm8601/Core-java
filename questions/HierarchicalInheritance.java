// Write a java programs to demonstrate Hierarchical inheritance.
package questions;

class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

class domesticAnimal {
    public void allowAnimal(Animal a){
        a.sound();
        System.out.println();
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        domesticAnimal d = new domesticAnimal();
        d.allowAnimal(new Dog());
        d.allowAnimal(new Cat());
    }
}
