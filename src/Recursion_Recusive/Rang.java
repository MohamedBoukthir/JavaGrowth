package Recursion_Recusive;

class Rang {
    // Function Sum of the range between two number
    static int RangeSum(int a, int b) { // 6 .. 4 || 4 .. 6
        if (a == b) /*BASE CASE*/ {
            System.out.println("Sorry, You Enter The The Same Number!!");
            return a;
        }
        else {
            if (a < b)
                return a + RangeSum(a+1, b);
            else
                return a + RangeSum(a-1, b);
        }
    }
    public static void main(String[] args) {
        System.out.println("RangSum = " + RangeSum(5,5));
    }
}
