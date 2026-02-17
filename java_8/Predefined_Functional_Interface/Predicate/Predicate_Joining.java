package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee{
    String name;
    String address;
    String role;

    public Employee(String name, String address, String role){
        this.name = name;
        this.address = address;
        this.role = role;
    }
}
public class Predicate_Joining {
    public static void main(String[] args) {
        Employee e1 = new Employee("Mani", "Pune" , "ML");
        Employee e2 = new Employee("Aman", "Hyd" , "Java");
        Employee e3 = new Employee("Deep", "Punjab" , "C++");
        Employee e4 = new Employee("Vijay", "Pune" , "ML");

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4);

        Predicate<Employee> p1 = emp -> emp.address.equals("Pune");
        Predicate<Employee> p2 = emp -> emp.role.equals("ML");

        Predicate<Employee> p3 = p1.and(p2);

        for (Employee emp : employees) {
            if (p3.test(emp)) {
                System.out.println(emp.name);
            }
        }

    }
}
