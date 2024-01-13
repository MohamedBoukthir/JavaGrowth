package Static_Keyword;

/* -------------- STATIC CLASS -------------- */

public class OuterClass {
    static String name = "Mohamed";
    /* a class can be made static only if it s a NESTED CLASS */
    public static class InnerClass{
        // simple print method
        public void print(){
            // in the inner static class you can only use the static variables directly
            System.out.println("Hello, " + name);
        }
    }
}
