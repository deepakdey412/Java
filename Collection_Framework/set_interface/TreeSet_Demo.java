package set_interface;

import java.util.TreeSet;

public class TreeSet_Demo {
    public static void main(String[] args) {
        //Store the unique elements
        //Store in sorting order
        //Dont have the index order
        //internaly user compareTo() and equals() methods to sort
        //get() and set() is not allowed
        //Initial capacity is not there
        //Implement all the methods of the collection

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(88);
        ts.add(19);
        ts.add(1);
        ts.add(10);
        ts.add(188);
        ts.add(105);

        System.out.println("Print : "+ ts);

        System.out.println("Size : "+ ts.size());

        for (Integer i : ts) {
            System.out.println(i);
        }

    }
}
