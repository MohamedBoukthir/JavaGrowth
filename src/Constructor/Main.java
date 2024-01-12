package Constructor;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("desk","great desk", 100, 10, 20);
        p1.Display(); //  output : desk  -  great desk  -  100.0   -   10  -   20.0  -  null (Parameterized Constructor)
        p1.setPrice(150); // update an attributes of the p1 object


        Product p2 = new Product();
        p2.Display(); // output : no name  -  no description  -  0.0  -  0  -  0.0  (NO-Arg Constructor)


        /*  ANY OBJECT WE CREATED WITHOUT NO ARG CONSTRUCTOR IT WILL AUTOMATICALLY USE THE DEFAULT CONSTRUCTOR
          --------------------- (ONLY WHEN YOU DON'T WRITE AN CONSTRUCTOR IN THE CLASS ) ---------------------
          ------------ (IF YOU HAVE AN CONSTRUCTOR IN THE CLASS SO THE JDK WILL RETURN AN ERROR ) ------------

           Product p3 = new Product();
           p3.Display(); // output : null  -  null  -  0.0  -  0  -  0.0 (Default Constructor)

          */



        Product p4 = new Product("camera","great camera", 500, 20, 60,"red");
        p4.Display(); // output : desk  -  great desk  -  100.0   -   10  -   20.0   -   red (Constructor Chaining)


        Product p5 = new Product(p4); // copy the data values of p4 to the p5
        p5.Display(); //  output : desk  -  great desk  -  100.0   -   10  -   20.0   -   red (Copy Constructor)






    }
}
