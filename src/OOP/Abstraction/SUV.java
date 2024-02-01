package OOP.Abstraction;

public class SUV extends Car{

    @Override
    void autoPilot() {
        System.out.println("SUV auto pilot");
    }

    @Override
    void streamingServices() {
        System.out.println("SUV streaming services");
    }

    @Override
    void parkingSensors() {
        System.out.println("SUV parking sensors");
    }
}
