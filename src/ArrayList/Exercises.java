package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {

        // create an list of distinct elements taken from the users and print these elements
        ArrayList list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter some inputs : ");
           int num = scanner.nextInt();
           if (!list.contains(num))
               list.add(num);
        }
        System.out.println(list); // input : [1, 2, 3, 5]

    }
}
