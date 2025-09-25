package oops;

class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class Monkey extends Animal{
    @Override
    public void eat(){
        System.out.println("Monkey is steals and eats");
    }
    @Override
    public void sleep(){
        System.out.println("Monkey is sleeping");
    }
}
class Deer extends Animal{
    @Override
    public void eat(){
        System.out.println("Deer is graze and eats");
    }
    @Override
    public void sleep(){
        System.out.println("Deer is sleeping");
    }
}
class Lion extends Animal{
    @Override
    public void eat(){
        System.out.println("Lion is hunts and eats");
    }
    @Override
    public void sleep(){
        System.out.println("Lion is sleeping");
    }
}

class Forest{
    public void allowAnimal(Animal animal){
        animal.eat();
        animal.sleep();
        System.out.println();
    }
}

public class NextOneOverriding {
    public static void main(String[] args) {

        Forest f = new Forest();
        f.allowAnimal(new Monkey());
        f.allowAnimal(new Deer());
        f.allowAnimal(new Lion());
    }
}
