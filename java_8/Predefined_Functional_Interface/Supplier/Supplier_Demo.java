package Supplier;

import java.util.function.Supplier;

public class Supplier_Demo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            String otp = "";
            for (int i = 1; i <= 10; i++) {
                otp = otp + (int)(Math.random() * 10);
            }
            return otp;
        };

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
