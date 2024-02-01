package OOP.Abstraction;

public class Main {

    static void fun(Car car) {
        car.autoPilot();
    }

    public static void main(String[] args) {

     /*
        SUV car1 = new SUV(20,20,4);
        car1.autoPilot();
        car1.streamingServices();
        car1.parkingSensors();
     */

        // Polymorphism using abstract classes
        fun(new SUV()); // output : SUV auto pilot
        fun(new Hatchback()); // output : Hatchback auto pilot

    }
}
