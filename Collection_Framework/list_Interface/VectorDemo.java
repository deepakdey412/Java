package list_Interface;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        //It implements all the methods of the collection
        //It also follow the insertion order
        //It is legacy class -> came in jdk 1.0
        //It is thred safe -> ArrayList is not thread safe

        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        System.out.println("Add 5 : " +v.add(5));
        System.out.println("Print vector : "+ v);
        System.out.println("Remove 5 : " +v.remove(5));
        System.out.println("Print vector : "+ v);




    }
}
