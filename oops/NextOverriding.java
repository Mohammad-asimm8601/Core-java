package oops;

class Plane{

    public void takeOff(){
        System.out.println("Plane is takeOff..");
    }

    public void fly(){
        System.out.println("Plane is fly");
    }

    public void land(){
        System.out.println("Plane is land");
    }
}

class PassengerPlane extends Plane{
    @Override
    public void takeOff(){
        System.out.println("Passenger-Plane is takeOff..");
    }

    @Override
    public void fly(){
        System.out.println("Passenger-Plane is fly");
    }

    @Override
    public void land(){
        System.out.println("Passenger-Plane is land");
    }
}
class CargoPlane extends Plane{
    @Override
    public void takeOff(){
        System.out.println("Cargo-Plane is takeOff..");
    }

    @Override
    public void fly(){
        System.out.println("Cargo-Plane is fly");
    }

    @Override
    public void land(){
        System.out.println("Cargo-Plane is land");
    }
}
class FighterPlane extends Plane{
    @Override
    public void takeOff(){
        System.out.println("Fighter-Plane is takeOff..");
    }

    @Override
    public void fly(){
        System.out.println("Fighter-Plane is fly");
    }

    @Override
    public void land(){
        System.out.println("Fighter-Plane is land");
    }
}

class Airport{
    // TruePolymorphism
    public void allowPlane(Plane p){
        p.takeOff();
        p.fly();
        p.land();
        System.out.println();
    }
}

public class NextOverriding {
    public static void main(String[] args) {
        

        PassengerPlane p = new PassengerPlane();
        CargoPlane c = new CargoPlane();
        FighterPlane f = new FighterPlane();

        Airport a = new Airport();
        a.allowPlane(p);
        a.allowPlane(c);
        a.allowPlane(f);
    

    }
}
