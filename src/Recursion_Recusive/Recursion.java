package Recursion_Recusive;

class Recursion {
    // factorial function
    static int fact(int n){
        if (n == 1 || n ==0) // BASE CASE
            return 1;
        else
          return n * fact(n - 1);
             /*
               5 * fact(4)
                 5 * fact(3)
                   5 * fact(2)
                     5 * fact(1)
            */
    }
    public static void main(String[] args) {
        System.out.printf("Fact = " + fact(5));
    }
}
