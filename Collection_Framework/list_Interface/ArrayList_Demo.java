package list_Interface;

import java.util.ArrayList;

public class ArrayList_Demo {
    public static void main(String[] args) {

//      ArrayList without Generics We can store Hetrogenous elements
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add(null);
        a1.add("Deepak");

        System.out.println("ArrayList 02 : " + a1); // Internally it calls the toStrings Methods to print this list

        ArrayList a2 = new ArrayList();
        a2.add(100.50);
        a2.addAll(a1);
        System.out.println("ArrayList 02 : " +a2);

        //ArrayList with Generics -> store homogenuouss elements
        ArrayList<String> a3 = new ArrayList();
        a3.add("deepak");
        a3.add("mani");
        a3.add("cherry");
        a3.add("vijay");
        System.out.println("ArrayList 03 : " +a3);

        a3.addFirst("lata");
        a3.addLast("mohan");
        System.out.println("ArrayList 03 : " +a3);

        int size = a3.size();
        System.out.println("ArrayList 03 size : " +size);

        a3.remove(0);
        System.out.println("ArrayList 03 after removeing first element : " +a3);

        boolean isempty = a3.isEmpty();
        System.out.println("Check is Empty or not ArrayList 03 : " +isempty);

        a3.set(0 , "Deepak"); //Replace the element
        System.out.println("ArrayList 03 : " +a3);

        a3.add(0, "DDEY");// Add the element at index
        System.out.println("ArrayList 03 : " +a3);

        System.out.println("ArrayList 03 Index of cherry : " +a3.indexOf("cherry"));

        System.out.println("ArrayList 03 get at index: " +a3.get(5));
        a3.clear();
        System.out.println("ArrayList 03 : " +a3);

        a3.removeAll(a3);
        System.out.println("ArrayList 03 : " +a3);
    }
}
