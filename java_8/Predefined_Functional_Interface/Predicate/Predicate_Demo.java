package Predicate;

import java.util.function.Predicate;

public class Predicate_Demo {
    public static void main(String[] args) {
        System.out.println("Single Condition : ");
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        System.out.println("Multiple Conditions (.and()) : ");
        Predicate<Integer> isEven2 = x -> x % 2 == 0;
        Predicate<Integer> isGreaterThan10 = x -> x > 10;

        Predicate<Integer> combined = isEven2.and(isGreaterThan10);
        System.out.println(combined.test(12));

        System.out.println("Find name starts with A : ");
        String[] names = {"Aman", "Deepak", "Ajay", "Mani", "Arun"};
        Predicate<String> isStartWithA = (s) -> s.charAt(0) == 'A';

        for (String name : names) {
            if (isStartWithA.test(name)) {
                System.out.print(name+" ");
            }
        }


    }
}
