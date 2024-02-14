package OOP.Abstraction.InterfaceJava;

public interface NestedInterface {
    void print();
    interface InnerInterface{
        void read();
    }


    // HOW IMPLEMENTS THE INNER INTERFACE ?
    /*
     class Class implements NestedInterface.InnerInterface{
            ..
            ..
     }
    */
}
