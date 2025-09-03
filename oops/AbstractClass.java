package oops;

abstract class Bird{

    public abstract void fly();
    public abstract void eat();
}

class Sparrow extends Bird{
    public void fly(){
        System.out.println("Sparrow fly @short height");
    }
    public void eat(){
        System.out.println("Sparrow eat grains...");
    }
}
// Abstract class can contain : concrete, abstract methods
abstract class Eagle extends Bird{
    public void fly(){
        System.out.println("Eagle fly @very very height");
    }
    public  abstract void eat();
}


class SerpentEagle extends Eagle{
    public void eat(){
        System.out.println("Serpent eagle eats snake...");
    }
}
class GoldenEagle extends Eagle{
    public void eat(){
        System.out.println("Golden eagle catches prey over ocean");
    }
}

class Crow extends Bird{
    public void fly(){
        System.out.println("Crow fly @medium height...");
    }
    public void eat(){
        System.out.println("Crow fly @medium height...");
    }
}
class Sky{
    public void allowBIrd(Bird ref){
        ref.fly();
        ref.eat();
        System.out.println();
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Sky sky = new Sky();
        sky.allowBIrd(new Sparrow());
        sky.allowBIrd(new SerpentEagle());
        sky.allowBIrd(new GoldenEagle());
        sky.allowBIrd(new Crow());
    }
}
