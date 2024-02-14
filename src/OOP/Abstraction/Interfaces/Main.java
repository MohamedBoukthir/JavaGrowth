package OOP.Abstraction.Interfaces;

public class Main {

    static void interfaceMethod(SelfDrivable selfDrivable){
        selfDrivable.drive();
    }

    public static void main(String[] args) {


// Polymorphism in interface
        SelfDrivable car1 = new Car();
        car1.drive(); // output : drive car1
        car1 = new Car2();
        car1.drive(); // output : drive car2

// or
        interfaceMethod(new Car()); // output : drive car1
        interfaceMethod(new Car2()); // output : drive car2

    }
}
