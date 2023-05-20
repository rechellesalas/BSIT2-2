import java.util.*;
public class Main {
    public static int multiply_two_no(int a, int b) {


        if (b == 0)
            return 0;

        if (b > 0)
            return (a + multiply_two_no(a, b - 1));

        if (b < 0)
            return -multiply_two_no(a, -b);

        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int no1 = scan.nextInt();
        System.out.print("Input second integer: ");
        int no2 = scan.nextInt();
        scan.close();
        System.out.println("Product of the two integers: "+multiply_two_no(no1, no2));
    }
}
