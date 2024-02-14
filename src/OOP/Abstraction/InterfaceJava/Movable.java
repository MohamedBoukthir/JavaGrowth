package OOP.Abstraction.InterfaceJava;

public interface Movable {

    void MoveUp();
    void MoveDown();
    void MoveLeft();
    void MoveRight();

    // when we want to add new method
    // the default access modifier => by default is  public
    default void newMethod(){
        privateMethod();
    };

    // static method
    private void privateMethod(){
        System.out.println("print something ...");
    };

    // static method
    static void Method(){
        System.out.println("static method");
    };

}
