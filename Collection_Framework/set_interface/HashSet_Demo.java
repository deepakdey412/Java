package set_interface;

import java.util.HashSet;

public class HashSet_Demo {
    public static void main(String[] args) {

        //Store the unique elements
        //Dont follow the insertion order
        //Dont have the index order
        //internaly user hashtable Data structure
        //get() and set() is not allowed
        //Initial capacity is 16 and increment in 75% / 0.75 of initial capacity
        //Implement all the methods of the collection

        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(100);
        hs.add(28);
        hs.add(38);
        hs.add(4666);
        hs.add(5777);
        hs.add(5777);
        System.out.println("Print hashset : "+ hs);


    }
}
