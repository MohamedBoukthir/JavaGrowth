package OOP.Abstraction;

public class Hatchback extends Car{

    @Override
    void autoPilot() {
        System.out.println("Hatchback auto pilot");
    }

    @Override
    void streamingServices() {
        System.out.println("Hatchback streaming services");
    }

    @Override
    void parkingSensors() {
        System.out.println("Hatchback parking sensors");
    }
}
