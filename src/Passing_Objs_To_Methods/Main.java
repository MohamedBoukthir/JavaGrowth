package Passing_Objs_To_Methods;

public class Main {

//    static void function(int n) {
//        n++;
//    }
//
//    static void function(MyNumber number){
//        number.value++;
//    }

    public static void main(String[] args) {

        /*  Passing Objects to Methods (By Value VS By Reference / Passing Object As Arguments)  */

//                int number = 1;
//                function(number);
//                System.out.println("result is : " + number); // output : result is : 1

        // WHY ?
        /* BECAUSE :
         In Java, when you pass a primitive data type (such as int) to a method, the method receives a copy of the value,
         not the actual variable. Therefore, any changes made to the parameter within the method do not affect the original
         variable outside the method.
        */

        // SOLUTION
        /* Wrap the primitive data type inside an object TO BENEFIT WITH THE CALL WITH REFERENCE */
//                MyNumber obj = new MyNumber();
//                obj.value = 1;
//                function(obj);
//                System.out.println("result is : " + obj.value); // output : result is : 2


        /* --------------------------------------------------------------------------------------------------- */


        /*  Returning Objects */

        /* First way */

//        Add n1 = new Add(5);
//        Add n2 = new Add(6);
//        Add n3 = Add.math(n1,n2);
//        System.out.println("n3 = " + n3.val); // output : 11

        /* Another way */

//        Add n1 = new Add(5);
//        Add n2 = new Add(6);
//        Add n3 = n1.math(n2); //
//        System.out.println("n3 = " + n3.val); // output : 11

        /* Comparing Objects */

        Add obj1 = new Add(5);
        Add obj2 = new Add(8);
        System.out.println(obj1.isEqual(obj2)); // output : false



    }
}
