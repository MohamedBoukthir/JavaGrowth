package Array;

// Declaration o Array
    // 1D Array
        // int arr[] = new int[];
    // 2D Array
        // int arr[][] = new int[rows][cols]; (At least Declare the rows of 2D array)

class TwoDimensionalArray {
    public static void main(String[] args) {

        // Declaration and Initialization Of 2D Array (Best Practice)
//        int[][] arr1 = {
//                {1, 2, 3, 9}, // 4 cols in row 0
//                {2, 4, 5}, // 3 cols in row 1
//                {4, 8}, // 2 cols in row 2
//                {5} // 1 cols in row 3
//        };
        // OR (Declaration and Initialization Of 2D Array)
//        int[][] arr = new int[2][3]; // Array Declaration (with the same cols or each row)
//        arr[0] = new int[3]; // Set numbers o cols in row 0
//        arr[1] = new int[2]; // Set numbers o cols in row 1
//        // initialization
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;


//        System.out.println(arr1.length); // print the number of rows (output = 4)
//        System.out.println(arr1[0].length); // print the number of cols in rows 0 (output = 4)
//        System.out.println(arr1[1].length); // print the number of cols in rows 1 (output = 3)
//        System.out.println(arr1[2].length); // print the number of cols in rows 2 (output = 2)
//        System.out.println(arr1[3].length); // print the number of cols in rows 3 (output = 1)

//         print the Array (using for loop)
//        for (int i = 0; i < arr1.length; i++) { /* rows loop */
//            for (int j = 0; j < arr1[i].length; j++) { /* cols loop */
//                System.out.print(arr1[i][j] + " ");
//            }
//            System.out.println(); // return the line when finish each row
//        }

        // print the Array (using for each loop)
//        for (int[] row : arr1) { /* rows loop */
//            for (int col : row) { /* cols loop */
//                System.out.print(col + " ");
//            }
//            System.out.println(); // return the line when finish each row
//        }


        /*------------------------------------- Matrix -------------------------------------*/

        // transform matrix 2 x 3
        /* Need to Transform to :
         1 5
         2 6
         3 8
         */
        int [][] arr =  {
                {1, 2, 3},
                {5, 6, 8}
        };

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }


    }
}

