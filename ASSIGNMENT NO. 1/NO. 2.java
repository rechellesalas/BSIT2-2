import java.util.*;
// main class
public class Main
{
// main driver method
    public static void main(String[] args)

    {
// taking input from standard input
        Scanner in = new Scanner(System.in);
// asking for the first input
        System.out.print("Please input the first factor: ");
        int no1 = in.nextInt(); // line separator
// asking for the second input
        System.out.print("Please input the second factor: ");
        int no2 = in.nextInt(); // line separator ]r
// line print for 'result'
        System.out.println("Results: ");
// calculation and printing the product
        System.out.println( no1 + " x " + no2 + " = " + no1 * no2);
    }

}