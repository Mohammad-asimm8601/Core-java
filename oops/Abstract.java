package oops;

abstract class  Plane{

    public abstract  void takeOff();
    public abstract  void fly();
    public abstract void land();
}

class PassengerPlane extends Plane{
    public void takeOff(){
        System.out.println("Passenger-Plane is takeOff..");
    }

    public void fly(){
        System.out.println("Passenger-Plane is fly");
    }

    public void land(){
        System.out.println("Passenger-Plane is land");
    }
}
class CargoPlane extends Plane{
    public void takeOff(){
        System.out.println("Cargo-Plane is takeOff..");
    }

    public void fly(){
        System.out.println("Cargo-Plane is fly");
    }

    public void land(){
        System.out.println("Cargo-Plane is land");
    }
}
class FighterPlane extends Plane{
    public void takeOff(){
        System.out.println("Fighter-Plane is takeOff..");
    }

    public void fly(){
        System.out.println("Fighter-Plane is fly");
    }

    public void land(){
        System.out.println("Fighter-Plane is land");
    }
}

class Airport{
    // TruePolymorphism
    public void allowPlane(Plane ref){
        ref.takeOff();
        ref.fly();
        ref.land();
        System.out.println();
    }
}

public class Abstract {
    public static void main(String[] args) {
        Airport a = new Airport();
        a.allowPlane(new PassengerPlane());
        a.allowPlane(new CargoPlane());
        a.allowPlane(new FighterPlane());
    }
}
