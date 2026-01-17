package set_interface;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedSet_Demo {
    public static void main(String[] args) {

        //Store the unique elements
        //follow the insertion order
        //Dont have the index order
        //internaly user Doubly linkedlist Data structure
        //get() and set() is not allowed
        //Initial capacity is not there like linklist
        //Implement all the methods of the collection

        LinkedHashSet<Integer> ll = new LinkedHashSet<Integer>();
        ll.add(155);
        ll.add(9955);
        ll.add(55);
        ll.add(1555);
        ll.add(1);
        ll.add(1558);

        System.out.println("Print : "+ ll);

    }
}
