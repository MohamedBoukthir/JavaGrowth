package Array;

import java.util.Arrays;
import java.util.Scanner;

/*
  Declaration o an Array Integer
          int[] n = new int [2];
          int n[]  = new int [2];
          int[] n = {1, 2, 3}; // Declaration and Initialization
 * */

class OneDimensionalArray {
    public static void main(String[] args) {

        // sort an array o char
        char[] arr = {'M', 'O','h','A','M','e','d'};
        Arrays.sort(arr); // sorting this char by their ASCII code
        System.out.println(arr);

//        // Array o char
//        // char arr[] = {'M', 'o','h','a','m','e','d'};
//        char arr[] = {65, 66}; // ASCII Code O "A"and "B"
//        System.out.println(arr);

//        // Sort numeric Array
//        int arr[] = {10, 8, 9, 2, 4, 7};
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }

//        // minimum and maximum
//        int arr[] = {10, 8, 9, 2, 4, 7};
//        int min = arr[0];
//        int max = arr[0];
//        for (int i = 1; i < arr.length ; i++) {
//            if (arr[i] < min)
//                min = arr[i];
//            if (arr[i] > max)
//                max = arr[i];
//        }
//        System.out.printf("The max is %d\t",max);
//        System.out.printf("The max is %d\t",min);



//        // check If a specific value exist in Array
//        Scanner input = new Scanner(System.in);
//
//        int arr[] = new int[5];
//        boolean flag = false;
//        System.out.print("Enter a Number\t");
//        int SearchedFor = input.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//            if (arr[i] == SearchedFor) {
//                flag = true;
//                break;
//            }
//        }
//        if (flag) {
//            System.out.println("Found");
//        }
//        else
//            System.out.println("Not Found");



//        // User Input Array
//        Scanner input = new Scanner(System.in);
//        int arr[] = new int[2];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Enter a Number : ");
//            arr[i] = input.nextInt();
//        }
//        // use Arrays.toString to print the Array
//        System.out.println(Arrays.toString(arr));



//        // avg of value of array
//        int arr[] = {1, 2, 6, 9, 8};
//        float avg = 0;
//        for (int i = 0; i < arr.length; i++) {
//            avg = (avg + arr[i]) / arr.length;
//        }
//        System.out.println(avg);



//        // Sum of values of an array
//            int arr[] = {1, 2, 5, 8, 7};
//            int sum = 0;
//            for (int i = 0; i < arr.length; i++) {
//                sum += arr[i];
//            }
//        System.out.println(sum);



//        //  User input sum
//            Scanner input = new Scanner(System.in);
//            int arr[] = new int[4];
//            int sum = 0;
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println("Enter The Number Num\t" + (i+1));
//                arr[i] = input.nextInt();
//                sum += arr[i];
//            }
//            System.out.println("The Sum Of array is :\t" + sum);

    }
}
