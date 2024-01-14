package Passing_Objs_To_Methods;

public class Add {
    int val;

    public Add(int value){
        this.val = value;
    }
    public Add(){}

    // Simple Function To Add two Objects

    /* First way */
//    static Add math(Add n1, Add n2){
//        Add n3 = new Add();
//        n3.val = n1.val + n2.val;
//        return n3;
//    }
    /* Another way */
//     Add math(Add n2){
//        Add n3 = new Add();
//        n3.val = this.val + n2.val; // "this" refer ro the object who call the method
//        return n3;
//    }

    // Simple Function To compare between two Objects
    boolean isEqual(Add obj){
        return this.val == obj.val;
        // OR
//        if (this.val == obj.val)
//            return true;
//        else
//            return false;
    }
}
