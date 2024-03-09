package AnonymousInnerClass;

public class Main {

    public interface Showable {
        public void print();
    }

    public static void main(String[] args) {

        /* ******* Anonymous Inner Class that Extends a class ******* */
        Reward reward1 = new Reward();
        Reward reward2 = new Reward();
             // anonymous Inner Class
        Reward reward3 = new Reward() {
            @Override
            public void reward(){
                System.out.println("You have 20$.");
            }
        } ;

        reward1.reward(); // output: You have 10$.
        reward2.reward(); // output: You have 10$.
        reward3.reward(); // output: You have 20$.

        System.out.println(reward1.getClass()); // output : class AnonymousInnerClass.md.Reward
        System.out.println(reward3.getClass()); // output : class AnonymousInnerClass.md.Main$1
        /* The $ symbol mean that the class was an Inner Class */


        /* ******* Anonymous Inner Class that implements an interface ******* */
        Showable showable = new Showable() {
            @Override
            public void print() {
                System.out.println("Show ...");
            }
        };
        showable.print(); // output : Show ...


        /* ******* Anonymous Inner Class with lambda expression ******* */
//        Showable showable;
//            showable = new Showable() {
//            @Override
//            public void print() {
//                System.out.println("Show ...");
//            }
//        };
//
//        showable = () ->  System.out.println("show lambda");
//        showable.print(); // output : show lambda
    }
}
