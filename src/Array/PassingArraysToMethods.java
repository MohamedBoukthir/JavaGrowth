package Array;

class PassingArraysToMethods {

//     Method To Print Array
//    static void printArr(int[] x) {
//        for (int i = 0; i < x.length; i++) {
//            System.out.print(x[i] + " ");
//        }
//    }

//     call by ref
//    static void modifyArray(int y[]){
//        y[0] = 50;
//    }
    public static void main(String[] args) {

//        int arr[] = {1, 2, 3, 4};
//        printArr(arr);

        //  in Java, arrays are passed by reference. When you pass an array to a method in Java,
        //  you're passing the reference to the array object, not a copy of the array.


//         Example 1
//        int arr1[] = {1, 2, 3, 4};
//        int arr2[] = {5, 6, 7, 8};
//        arr1 = arr2;
//        arr2[0] = 10;
//        System.out.println(arr2[0]);


//         Example 2
//        int arr1[] = {1, 2, 3, 4};
//        int arr2[] = {5, 6, 7, 8};
//        int arr3[] = {9, 10, 11, 12};
//        arr1 = arr2 = arr3;
//        arr1[0] = 0;
//        System.out.println(arr1[0]); // output will be 0
//        System.out.println(arr2[0]); // output will be 0
//        System.out.println(arr3[0]); // output will be 0



//        // ModifyArray Method
//        int arr[] = {4, 6, 8};
//        modifyArray(arr);
//        System.out.println(arr[0]); // output will be 50
    }
}
