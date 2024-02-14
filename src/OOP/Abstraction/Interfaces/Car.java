package OOP.Abstraction.Interfaces;

public class Car implements Movable, SelfDrivable {

    private int x,y;
    private int numberOfPassengers;

    public Car(){}
    public Car(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void MoveUp() {
        y--;
    }

    @Override
    public void MoveDown() {
        y++;
    }

    @Override
    public void MoveLeft() {
        x--;
    }

    @Override
    public void MoveRight() {
        x++;
    }

    @Override
    public void destination(String string) {
        System.out.println("destination = " + string);
    }

    @Override
    public void drive() {
        System.out.println("drive car1");
    }


}
