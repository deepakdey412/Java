package list_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkList_Demo {
    public static void main(String[] args) {
        //Implements all the methods of Collections
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        //Add method
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        linkedList.add(500);
        linkedList.add(500);
        linkedList.add(500);
        linkedList.add(500);

        System.out.println("Print LinkedList : " +linkedList); //Internally call toStrings();

        linkedList.add(2, 11111);
        System.out.println("Print LinkedList : " +linkedList);

        linkedList.remove(2);
        System.out.println("Print LinkedList : " +linkedList);

        linkedList.set(2, 1111); //Replace element
        System.out.println("Print LinkedList : " +linkedList);

        System.out.println("Size of LinkedList : " +linkedList.size());

        System.out.println("IsContains(Collecion mehtod) of LinkedList : " +linkedList.contains(1111));//Method from collection

        for(int i = 0 ;i<linkedList.size();i++){
            System.out.println("Print LinkedList : " +linkedList.get(i));
        }

        //Add ArrayList into LinkList
        ArrayList arrayList = new ArrayList();
        arrayList.add(1112);
        arrayList.add(2222);
        arrayList.add(3333);
        arrayList.add("Deepak");

        linkedList.addAll(arrayList);
        System.out.println("Print LinkedList : " +linkedList);

        System.out.println("Index of 500 LinkedList : " +linkedList.indexOf(500));
        System.out.println("Last Index of 500 Size of LinkedList : " +linkedList.lastIndexOf(500));

        linkedList.removeAll(arrayList);
        System.out.println("Is Empty : " +linkedList.isEmpty());

        int found = Collections.binarySearch(linkedList, 500);
        System.out.println("Is Empty : " +found);

    }
}
