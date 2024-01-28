package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Declaration
         /* ArrayList arrayList = new ArrayList(); */
        // Or
      // ArrayList<Integer> arrayList1= new ArrayList<>(); // By defaults has 10 in capacity
        // Or (use the List Interface)
        /* List <Integer> list = new ArrayList<>(); */

        // copy constructor (for arrayList initialization)

        /* ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(arrayList); // output : [1, 2, 3, 4] */

        // clone method (Returns a shallow copy of this ArrayList instance.)

      /*  ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, 6, 9));
        ArrayList<Integer> list2 ;
        list2 = (ArrayList) list1.clone();
        System.out.println(list2); // output : [5, 6, 9] */

        // add method

      /*  arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
      */

        // print method

       /* System.out.println(arrayList1); // output : [1, 2, 3, 4] */

        // get method

       /* int s = arrayList1.size();

        for (int i = 0; i < s; i++) {
            System.out.print( " " + arrayList1.get(i)); // output :  1 2 3 4
        } */

        // add at index method

       /* arrayList1.add(0,5);
        System.out.println(arrayList1); // output : [5, 1, 2, 3, 4] */

        // ArrayList<Integer> arrayList2 = new ArrayList<>();

        // addAll methods
       /*
            arrayList2.addAll(arrayList1); // add all elements of arraylist 1 to the second arraylist
            System.out.println(arrayList2); // output : [1, 2, 3, 4]
        */
         /*
            arrayList2.addAll(Arrays.asList(10, 20, 30, 40));
            System.out.println(arrayList2); // output : [10, 20, 30, 40]
        */

        // addAll at position method

      /*  arrayList2.add(10);
        arrayList2.addAll(1,Arrays.asList(1, 2, 3, 4));
        System.out.println(arrayList2); // output : [10, 1, 2, 3, 4]  */

        // set methods (to override an element in the arraylist)

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,4,5));
        System.out.println(arrayList.get(0)); // output : 1
        arrayList.set(0, 10);
        System.out.println(arrayList.get(0)); // output : 10

        // remove methods
        // at index
        arrayList.remove(0);
        System.out.println(arrayList); // output : [2, 3, 4, 4, 5]
        // remove object
        arrayList.remove((Integer) 2);
        System.out.println(arrayList); // output : [3, 4, 4, 5]
        // removeAll
        arrayList.removeAll(Arrays.asList(4)); // to remove all the 4
        System.out.println(arrayList); // output : [3, 5]
        // remove if
        arrayList.removeIf(n->n%2 != 0);
        System.out.println(arrayList); // output : [] (empty arrayList because it removes all odd elements)

        // ------------ Array of objects ------------
        ArrayList arrayOfObjects = new ArrayList<>(Arrays.asList(1, '4', true, "mohamed"));
        System.out.println(arrayOfObjects); // output : [1, 4, true, mohamed]



    }
}
