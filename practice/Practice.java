import java.lang.constant.ClassDesc;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String name =  sc.next();
        String sername =  sc.nextLine();
        System.out.println((n * m));
        System.out.println( name);
        System.out.println( sername);
        System.out.println( sername.length());

        int result = input(sc);
    }
    public static int input(Scanner sc) {
        int num = sc.nextInt();
        return num;
    }
}
