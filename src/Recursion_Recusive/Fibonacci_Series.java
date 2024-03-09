package Recursion_Recusive;

class Fibonacci_Series {
    /*
    The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones,
    starting with 0 and 1.
       NUMBER    0 1 2 3 4 5 6 7  8  9  10 ...
       FIBONACCI 0 1 1 2 3 5 8 13 21 34 55 ...
    */

    static int fibonacci(int n) {
        if (n == 0 || n ==1) // BASE CASE
            return n;
        else
            // RECURSION
            return fibonacci(n -1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci = " + fibonacci(12));
    }
}
